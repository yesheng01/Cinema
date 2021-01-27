/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * Main
 * Created by: sheng
 * Date : 20/01/2021
 * Description:
 **/
public class Main {
        public static void main(String[] args) {

            long tStart,tEnd,tTotal;
            tStart=System.currentTimeMillis();

            //Creamos la pelicula a reproducir
            Pelicula pelicula = new Pelicula("Wonder Woman", "Patty Jenkins",  150, 16);

            //Creo el cine, necesito la pelicula para ello
            Cinema cine = new Cinema(8, 9 , 4,pelicula);


            //Variables y objetos usados
            Espectador e;
            int fila;
            char letra;

            System.out.println("Espectadores que se han generado: ");
            //Termino cuando no queden espectadores o no haya mas sitio en el cine
            while (cine.sitio()) {
                //Generamos un espectador
                e = new Espectador(
                        Metodos.nombres[Metodos.generaNumeroEnteroAleatorio(0, Metodos.nombres.length - 1)], //Nombre al azar
                        Metodos.generaNumeroEnteroAleatorio(7, 20), //Generamos una edad entre 7 y 20
                        Metodos.generaNumeroEnteroAleatorio(1, 10)); //Generamos el dinero entre 1 y 10 euros

                //Mostramos la informacion del espectador
                System.out.println(e);

                //Generamos una fila y letra
                //Si esta libre continua sino busca de nuevo
                do {

                    fila = Metodos.generaNumeroEnteroAleatorio(0, cine.getFilas() - 1);
                    letra = (char) Metodos.generaNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas()-1));

                } while (cine.tieneSitioButaca(fila, letra));


                //Si el espectador cumple con las condiciones
                if (cine.sePuedeSentar(e)) {
                    e.pagar(cine.getPrecio()); //El espectador paga el precio de la entrada
                    cine.setBalance(cine.getPrecio());
                    cine.sentar(fila, letra, e); //El espectador se sienta
                }

            }
            cine.mostrar(); //Mostramos la información del cine, tambien se puede usar un toString
            System.out.println("Total dinero ganado: "+cine.getBalance()+"€");

           //Da el tiempo de ejecucion y lo mostramos en un sout
            tEnd=System.currentTimeMillis();
            tTotal=tEnd-tStart;
            System.out.println("Tiempo de ejecución total: "+tTotal + "miliseg");

            //Acaba

            System.out.println("Fin");

        }

    }
