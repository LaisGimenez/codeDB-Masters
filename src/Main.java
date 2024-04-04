import controlador.ExcursionesControlador;
import controlador.SociosControlador;
import modelo.ExcursionesModelo;
import modelo.FederacionesModelo;
import modelo.SeguroBasicoModelo;
import modelo.SeguroCompletoModelo;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creamos dos excursiones para comprobar si el filtro funciona sin tener que introducir excursiones cada vez que ejecutemos el programa
        ExcursionesModelo excursion = new ExcursionesModelo("A190", "Montaña", LocalDate.of(2024, 3, 28), 3, 120);
        ExcursionesModelo excursion2 = new ExcursionesModelo("B200", "Playa", LocalDate.of(2024, 4, 30), 1, 50);
        //Creamos las instancias de las federaciones para registrar los socios Federadors
        FederacionesModelo fedFEEC = new FederacionesModelo("A001", "FEEC");
        FederacionesModelo fedFEDME = new FederacionesModelo("B001", "FEDME");
        //Inciamos las instancias de los seguros
        SeguroCompletoModelo seguroCompleto = new SeguroCompletoModelo();
        SeguroBasicoModelo seguroBasico = new SeguroBasicoModelo();

        //Iniciamos los controladores controlador
        ExcursionesControlador controladorEx = new ExcursionesControlador();
        SociosControlador controladorSoc = new SociosControlador();
        //Usamos el controlador para añadir las excursiones al arraylist de excursiones
        controladorEx.addExcursion(excursion);
        controladorEx.addExcursion(excursion2);
        //El controlador inicia la vista de excursiones para desplegar el menú en pantalla
        //controladorEx.iniciar();
        controladorSoc.iniciar();
    }
}