package codeDB_masters.controlador;

import codeDB_masters.modelo.InscripcionesModelo;
import codeDB_masters.vista.InscripcionesVista;


import java.time.LocalDate;
import java.util.ArrayList;

public class InscripcionesControlador {

    // Atributos para relacionar la vista con el ArrayList de inscripciones
    private InscripcionesVista vista;
    private ArrayList<InscripcionesModelo> inscripciones;

    // Constructor
    public InscripcionesControlador() {
        this.vista = new InscripcionesVista();
        this.inscripciones = new ArrayList<>();
    }

    // Método para iniciar el controlador y manejar el menú
    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuGestionInscripcionesVista();
            switch (opcion) {
                case 1:
                    agregarInscripcion();
                    break;
                case 2:
                    mostrarInscripcion();
                    break;
                case 3:
                    eliminarInscripcion();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca una opción válida.");
            }
        } while (opcion != 4);
    }

    // Método para agregar una inscripción solicitando datos al usuario
    public void agregarInscripcion() {
        InscripcionesModelo inscripcion = vista.datosInscripcion();
        inscripciones.add(inscripcion);
        vista.mostrarMensaje("Inscripción añadida correctamente.");
    }

    // Método para mostrar inscripciones filtradas por fechas
    public void mostrarInscripcion() {
        LocalDate[] fechas = vista.fechasFiltroInscripciones();
        LocalDate fechaInicio = fechas[0];
        LocalDate fechaFin = fechas[1];

        vista.mostrarMensaje("Inscripciones entre " + fechaInicio + " y " + fechaFin + ":");

        for (InscripcionesModelo inscripcion : inscripciones) {
            LocalDate fechaExcursion = inscripcion.getFechaExcursion();
            if (fechaExcursion.compareTo(fechaInicio) >= 0 && fechaExcursion.compareTo(fechaFin) <= 0) {
                vista.mostrarInscripcion(inscripcion);
            }
        }
    }

    // Método para eliminar una inscripción
    public void eliminarInscripcion() {
        // Implementa la lógica para eliminar una inscripción
        // Puedes solicitar al usuario el número de socio o algún otro identificador para eliminar la inscripción adecuada
        vista.mostrarMensaje("Funcionalidad de eliminar inscripción aún no implementada.");
    }
}


