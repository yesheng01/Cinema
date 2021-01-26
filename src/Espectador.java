/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * Espectador
 * Created by: sheng
 * Date : 20/01/2021
 * Description:
 **/
public class Espectador {

    //Atributos
    private String nombre;
    private int edad;
    private double dinero;

    //Constructor
    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    //Metodos

    //Metodo de saber si pagas la entrada de la pelicula y entonces se bajara el coste del dinero que tienes

    public void pagar(double precio) {
        dinero -= precio;
    }

    //
    //Indicamos si el espectador tiene edad para ver la pelicula
    //
    //

    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }

       //
      // Indicamos si el espectador tiene dinero
     //

    public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }


    //
    //toString que luego saldra un print para que cuando luego se ejecute el main salgan esto
    //

    public String toString() {
        return "el nombre de los espectadores que hay  son " + nombre + " de " + edad + " años  y tienen " + dinero + " euros ";
    }


    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

}
