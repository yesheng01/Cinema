/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * pelicula
 * Created by: sheng
 * Date : 18/01/2021
 * Description:
 **/
public class Pelicula {
        private String titulo;
        private int duracion;
        private String director;
        private int minEdad;

        public Pelicula(String titulo , int duracion , int minEdad , String director){
            this.titulo = titulo;
            this.duracion = duracion;
            this.director = director;
            this.minEdad = minEdad;
        }



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

    public int getMinEdad() {
        return minEdad;
    }

    public void setMinEdad(int minEdad) {
        this.minEdad = minEdad;
    }
    public String toString() {
        return "'" + titulo + "' del director " + director + ", con una duracion de " + duracion + " minutos y la edad minima es de " + minEdad + " años";
    }
}
