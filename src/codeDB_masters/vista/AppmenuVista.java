package codeDB_masters.vista;

import java.util.Scanner;

public class AppmenuVista {

    //Propiedades teclado y salto línea
    static Scanner teclado = new Scanner(System.in);
    static String limpiezaconsola = "\n\n\n\n\n\n\n";

    //Propiedades de la clase

    public void menuInicioVista () {
        System.out.println( limpiezaconsola + "--MENÚ PRINCIPAL DE LA APLICACION--");
        System.out.println("   1.Gestión Excursiones");
        System.out.println("   2.Gestión Socios");
        System.out.println("   3.Gestión Inscripciones");
        System.out.println("   4.Salir de la aplicación");
    }

    public void menuGestionExcursionesVista () {
        System.out.println( limpiezaconsola + "--GESTIÓN EXCURSIONES--");
        System.out.println("   1.Añadir Excursión");
        System.out.println("   2.Mostrar Excursiones con filtro entre fechas");
        System.out.println("   3.Volver al menú principal");
            }

    public void menuGestionSociosVista () {
        System.out.println( limpiezaconsola + "--GESTIÓN SOCIOS--");
        System.out.println("   1.Añadir nuevo socio");
        System.out.println("   2.Modificar tipo seguro de socio estándar");
        System.out.println("   3.Mostrar socio");
        System.out.println("   4.Eliminar socio");
        System.out.println("   5.Mostrar factura mensual por socio");
        System.out.println("   6.Volver al menú principal");
    }

    public void menuGestionInscripcionesVista () {
        System.out.println( limpiezaconsola + "--GESTIÓN INSCRIPCIONES--");
        System.out.println("   1.Añadir Inscripción");
        System.out.println("   2.Mostrar Inscripciones con filtro por fecha y/o socios");
        System.out.println("   3.Eliminar Inscripción");
        System.out.println("   4.Volver al menú principal");
    }

    public int getOpcionVista (int value) {
        try{
            System.out.print( "Elije una opción válida (1 - " + value + " ): ");
            int opcion = Integer.parseInt(teclado.nextLine());
            if (opcion < 1 || opcion > value) {
                System.out.println("Opción no válida");
                return getOpcionVista(value);
            }
            return opcion;
        } catch (NumberFormatException e){
            System.out.println ("Opción no válida. Debe ingresar un número");
            return getOpcionVista(value);
        }
    }

    // El siguiente método se utilizará para devolver respuestas del controlador
    // fallos al guardar, guardado correcto, etc

    public void respuestaControlador(String respuesta) {
        System.out.println(respuesta);
        System.out.println( "\nPulsa una tecla para continuar...");
        teclado.nextLine();
    }
}
