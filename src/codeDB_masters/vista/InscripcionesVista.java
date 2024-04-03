package codeDB_masters.vista;

import codeDB_masters.modelo.InscripcionesModelo;

import java.util.Scanner;
import java.time.LocalDate;

public class InscripcionesVista {

    private Scanner scanner;

    public InscripcionesVista() {
        this.scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú de gestión de inscripciones
    public int menuGestionInscripcionesVista() {
        System.out.println("--GESTIÓN INSCRIPCIONES--");
        System.out.println("1. Añadir Inscripción");
        System.out.println("2. Mostrar Inscripciones con filtro por fecha y/o socios");
        System.out.println("3. Eliminar Inscripción");
        System.out.println("4. Volver al menú principal");
        System.out.println("Seleccione una opción (1-4): ");
        return scanner.nextInt();
    }

    // Método para solicitar datos de una inscripción al usuario
    public InscripcionesModelo datosInscripcion() {
        System.out.println("Añadiendo inscripción...");
        System.out.println("Introduzca el número de socio:");
        String nSocio = scanner.next();
        scanner.nextLine();
        System.out.println("Introduzca el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca la fecha de la excursión (YYYY-MM-DD):");
        LocalDate fechaExcursion = LocalDate.parse(scanner.next());
        scanner.nextLine();
        System.out.println("Introduzca la descripción:");
        String descripcion = scanner.nextLine();
        System.out.println("Introduzca el importe:");
        double importe = scanner.nextDouble();
        scanner.nextLine();
        return new InscripcionesModelo(nSocio, nombre, fechaExcursion, descripcion, importe);
    }

    // Método para solicitar fechas para filtrar inscripciones
    public LocalDate[] fechasFiltroInscripciones() {
        LocalDate[] fechas = new LocalDate[2];
        System.out.println("Mostrar Inscripciones con filtro por fecha");
        System.out.println("Introduzca la fecha de inicio (YYYY-MM-DD):");
        fechas[0] = LocalDate.parse(scanner.next());
        scanner.nextLine();
        System.out.println("Introduzca la fecha de fin (YYYY-MM-DD):");
        fechas[1] = LocalDate.parse(scanner.next());
        scanner.nextLine();
        return fechas;
    }

    // Método para mostrar una inscripción
    public void mostrarInscripcion(InscripcionesModelo inscripcion) {
        System.out.println("---------------");
        System.out.println("Número de Socio: " + inscripcion.getNSocio());
        System.out.println("Nombre: " + inscripcion.getNombre());
        System.out.println("Fecha de Excursión: " + inscripcion.getFechaExcursion());
        System.out.println("Descripción: " + inscripcion.getDescripcion());
        System.out.println("Importe: " + inscripcion.getImporte());
        System.out.println("---------------");
    }

    // Método para mostrar un mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
