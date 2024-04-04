package vista;
import modelo.*;

import java.util.Scanner;

public class SociosVista {
    private Scanner scanner;

    public SociosVista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Gestión de Socios");
        System.out.println("1. Añadir Socio Estándar");
        System.out.println("2. Modificar tipo de seguro de un socio estándar");
        System.out.println("3. Añadir Socio Federado");
        System.out.println("4. Añadir Socio Infantil");
        System.out.println("5. Eliminar socio");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int solicitarNuevoTipoSeguro() {
        System.out.println("Introduzca el nuevo tipo de seguro: ");
        System.out.println("1. Seguro Completo");
        System.out.println("2. Seguro Básico");
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        return opcion;
    }

    public void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    // Métodos para solicitar información al usuario
    public int solicitarNumeroSocio() {
        System.out.print("Introduzca el número de socio: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        return codigo;
    }

    public String solicitarNombreSocio() {
        System.out.print("Introduzca el nombre del socio: ");
        return scanner.nextLine();
    }

    public String solicitarNifSocio() {
        System.out.print("Introduzca el NIF del socio: ");
        return scanner.nextLine();
    }

    public SeguroModelo solicitarSeguroSocio() {
        System.out.println("Seleccione el tipo de seguro para el socio:");
        System.out.println("1. Seguro Completo");
        System.out.println("2. Seguro Básico");
        System.out.print("Elija una opción: ");

        int opcionSeguro = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        switch (opcionSeguro) {
            case 1:
                return new SeguroCompletoModelo();
            case 2:
                return new SeguroBasicoModelo();
            default:
                System.out.println("Opción no válida. Seleccionando Seguro Básico por defecto.");
                return new SeguroBasicoModelo();
        }
    }

    public void mostrarSocio(SocioEstandarModelo socio) {
        System.out.println("Socio añadido correctamente:");
        System.out.println("Número de socio: " + socio.getN_socio());
        System.out.println("Nombre del socio: " + socio.getNombre());
        System.out.println("NIF del socio: " + socio.getNif());
        System.out.println("Tipo de seguro: " + socio.getSeguro().getTipo());
        System.out.println("Precio del seguro: " + socio.getSeguro().getPrecio());
    }
    //Faltan argumentos que pedir al usuario?
}
