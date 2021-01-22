/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * Metodos
 * Created by: sheng
 * Date : 20/01/2021
 * Description:
 **/
public class Metodos {

    public static final String nombres[] = {"Antonio" , "Irene" , "Pedro" , "Alejandro"};

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}
