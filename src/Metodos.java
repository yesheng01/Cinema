/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * Metodos
 * Created by: sheng
 * Date : 20/01/2021
 * Description:
 **/
public class Metodos {

    //Hacemos un array donde metemos los nombres.

    public static final String nombres[] = {"Antonio" , "Irene" , "Pedro" , "Alejandro" , "Fernando " , "Matias" , "Fernanda"};


    //Metodo donde generaremos un numero aleatorio utilizando el Math.random donde coge un numero minimo y el maximo , al que le asignamos el numero maximo
    //que se suma 1 y se restando el minimo del maximo.


    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}
