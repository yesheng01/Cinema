/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * cinema
 * Created by: sheng
 * Date : 18/01/2021
 * Description:
 **/

public class Cinema {

    //Atributos

    private Asientos asientos[][];
    private int precio;
    private int balance;
    private Pelicula Pelicula;

    //Constructor

    public Cinema(int filas , int columnas, int precio, Pelicula pelicula) {
        asientos = new Asientos [filas][columnas]; //Array donde guarda las filas y columnas
        this.precio = precio;
        this.Pelicula = pelicula;
        llenarbutacas();
    }

    //Metodos

    //Metodo para rellenar las butacas asignandoles una fila y una columna

    private void llenarbutacas() {

        int fila = asientos.length;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                //Recuerda que los char se pueden sumar
                asientos[i][j] = new Asientos((char) ('A' + j), fila);
            }
            fila--; //Decremento la fila y se va actualizando
        }

    }

    //     Indicamos si hay sitio en el cine, si hay  una vacia salimos de
    //      este metodo que es asignado.

    public boolean sitio() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {

                if (!asientos[i][j].ocupado()) {
                    return true;
                }

            }
        }
        return false;
    }

    //
    // Indico si en una posicion concreta esta ocupada
    //

    public boolean tieneSitioButaca(int fila, char letra) {
        return getAsiento(fila, letra).ocupado();
    }


     //Indicamos si el espectador cumple lo necesario para entrar:
    // Tiene dinero
    // Tiene edad El tema de si hay sitio.
    // Y se funciona en el Main

    public boolean sePuedeSentar(Espectador e) {
        return e.tieneDinero(precio) && e.tieneEdad(Pelicula.getMinEdad());
    }

    //
     //Se sienta el espectador en la silla del cine
     //
    public void sentar(int fila, char letra, Espectador e) {
        getAsiento(fila, letra).setEspectador(e);
    }

     //  Se devuelve en un asiento concreto por su fila y letra al que le va asignando  y que en ella ira bajando los numero y tambien las letras en el return
    public Asientos getAsiento(int fila, char letra) {
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }

    //
     // Asigna el numero en las filas que hay en el cine
    //
    public int getFilas() {
        return asientos.length;
    }

     // Asigna el numero en las columas del cine.
     //A lo que va pasando por las columnas con el array
    public int getColumnas() {
        return asientos[0].length;
    }


     //Mostramos la información de nuestro cine , la pelicula que reproduciremos y el precio de la entrada que seria.

    public void mostrar() {

        System.out.println("Información del cine");
        System.out.println("Pelicula que sera proyectado : " + Pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }


    //Getters and Setters

    //Asigna los asientos
    public Asientos[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos[][] asientos) {
        this.asientos = asientos;
    }

    //obteniene el precio

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return Pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        Pelicula = pelicula;
    }

    //Coge el balance que sea recaudado

    public int getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance += balance;
    }
}
