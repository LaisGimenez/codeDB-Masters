package codeDB_masters.controlador;

import codeDB_masters.controlador.ExcursionesControlador;
import codeDB_masters.modelo.ExcursionesModelo;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creamos dos excursiones para comprobar si el filtro funciona sin tener que introducir excursiones cada vez que ejecutemos el programa
        ExcursionesModelo excursion = new ExcursionesModelo("A190", "Montaña", LocalDate.of(2024, 3, 28), 3, 120);
        ExcursionesModelo excursion2 = new ExcursionesModelo("B200", "Playa", LocalDate.of(2024, 4, 30), 1, 50);
        //Iniciamos el controlador
        ExcursionesControlador controlador = new ExcursionesControlador();
        //Usamos el controlador para añadir las excursiones al arraylist de excursiones
        controlador.addExcursion(excursion);
        controlador.addExcursion(excursion2);
        //El controlador inicia la vista de excursiones para desplegar el menú en pantalla
        controlador.iniciar();
    }
}