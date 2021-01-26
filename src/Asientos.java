/**
 * PACKAGE_NAME
 * Nombre_project: Cinema
 * Asientos
 * Created by: sheng
 * Date : 18/01/2021
 * Description:
 **/
public class Asientos {

        //Atributos

        private char letra;
        private int fila;
        private Espectador espectador; // informacion del espectador que esta sentado, null si es vacio

        //constructor

        public Asientos(char letra, int fila) {
            this.letra = letra;
            this.fila = fila;
            this.espectador = null; //al iniciar el asiento, no habrá nadie sentado
        }

        //Metodos

        //Getters and Setters

        public char getLetra() {
            return letra;
        }

        public void setLetra(char letra) {
            this.letra = letra;
        }

        public int getFila() {
            return fila;
        }

        public void setFila(int fila) {
            this.fila = fila;
        }

        public Espectador getEspectador() {
            return espectador;
        }

        public void setEspectador(Espectador espectador) {
            this.espectador = espectador;
        }


        //Otros metodos

        //
        //Indica si el asiento esta ocupado
        //

        public boolean ocupado() {
            return espectador != null;
        }


        //Le pasamos un toString donde saldra el mensaje de que si los asientos se llenan o no se llenan y esto saldra en el main

        public String toString() {
            if (ocupado()) {
                return "Asiento: " + fila + letra + " y " + espectador;
            }

            return "Asiento: " + fila + letra + " y este asiento está vacio ";

        }

    }
