/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * pelicula
 * Created by: sheng
 * Date : 18/01/2021
 * Description:
 **/
public class Pelicula {


        //Atributos

        private String titulo;
        private int duracion;
        private String director;
        private int minimoEdad;

        //Constructor

        public Pelicula(String titulo , String director ,  int duracion , int minimoEdad){
            this.titulo = titulo;
            this.duracion = duracion;
            this.director = director;
            this.minimoEdad = minimoEdad;
        }


    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMinimoEdad() {
        return minimoEdad;
    }

    public void setMinEdad(int minEdad) {
        this.minimoEdad = minEdad;
    }


    //Se le pasa un toString para que se muestre las informaciones del titulo de la pelicula ,
    // el director , lo que dura y la edad minima


    public String toString() {
        return "'" + titulo + "' del director " + director + "," +
                " con una duracion de " + duracion + " minutos y la edad minima es de " + minimoEdad + " años";
    }
}
