package controlador;
import modelo.SeguroModelo;
import modelo.SocioEstandarModelo;
import modelo.SeguroCompletoModelo;
import modelo.SeguroBasicoModelo;
import vista.SociosVista;
import java.util.ArrayList;


public class SociosControlador {

    //Atributos para relacionar la vista con el arraylist de socios
    private SociosVista vistaSoc;
    private ArrayList<SocioEstandarModelo> sociosEst;
    public SociosControlador() {
        this.vistaSoc = new SociosVista();
        this.sociosEst = new ArrayList<>();
    }

    public void iniciar() {
        int opcion;
        do {
            // Extraer la opción del menú desde la vista
            opcion = vistaSoc.mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarSocioEstandar();
                    break;
                case 2:
                    modificarTipoSeguroSocio();
                    break;
                case 3:
                    //agregarSocioFederado();
                    break;
                case 4:
                    //agregarSocioInfantil();
                    break;
                case 5:
                    //eliminarSocio();
                    break;
                case 0:
                    System.out.println("Saliendo del menú de Gestión de Socios...");
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca una opción válida.");
            }
        } while (opcion != 0);
    }

    public void agregarSocioEstandar() {
        vistaSoc.mostrarMensaje("Añadiendo Socio Estándar...");

        // Solicitar la información del socio al usuario
        int n_socio = vistaSoc.solicitarNumeroSocio();
        String nombre = vistaSoc.solicitarNombreSocio();
        String nif = vistaSoc.solicitarNifSocio();
        SeguroModelo seguro = vistaSoc.solicitarSeguroSocio();

        // Crear una instancia de SocioEstandarModelo con la información proporcionada por el usuario
        SocioEstandarModelo socioEstandar = new SocioEstandarModelo(n_socio, nombre, nif, seguro);

        // Agregar el socio a la lista de socios
        sociosEst.add(socioEstandar);

        vistaSoc.mostrarMensaje("Socio Estándar añadido correctamente.");

        vistaSoc.mostrarSocio(socioEstandar);
    }

    public void modificarTipoSeguroSocio() {
        vistaSoc.mostrarMensaje("Modificando tipo de seguro de un socio estándar...");

        // Mostrar la lista de socios estándar disponibles
        mostrarSociosEst();

        // Solicitar al usuario que elija el socio cuyo tipo de seguro desea modificar
        int numeroSocio = vistaSoc.solicitarNumeroSocio();
        SocioEstandarModelo socioSeleccionado = buscarSocioEstPorNumero(numeroSocio);

        if (socioSeleccionado != null) {
            // Solicitar al usuario que elija el nuevo tipo de seguro
            int opcionSeguro = vistaSoc.solicitarNuevoTipoSeguro();
            SeguroModelo nuevoSeguro = null;

            // Crear el nuevo tipo de seguro seleccionado por el usuario
            switch (opcionSeguro) {
                case 1:
                    nuevoSeguro = new SeguroCompletoModelo();
                    break;
                case 2:
                    nuevoSeguro = new SeguroBasicoModelo();
                    break;
                default:
                    vistaSoc.mostrarMensaje("Opción no válida. No se realizarán cambios en el tipo de seguro.");
                    return;
            }

            // Actualizar el tipo de seguro del socio seleccionado
            socioSeleccionado.setSeguro(nuevoSeguro);
            vistaSoc.mostrarMensaje("Tipo de seguro del socio modificado correctamente.");
        } else {
            vistaSoc.mostrarMensaje("El socio con el número especificado no existe.");
        }
    }

    private void mostrarSociosEst() {
        System.out.println("Lista de Socios Estándar Disponibles:");
        for (SocioEstandarModelo socio : sociosEst) {
            System.out.println("Número de socio: " + socio.getN_socio() + ", Nombre: " + socio.getNombre());
        }
    }

    private SocioEstandarModelo buscarSocioEstPorNumero(int numeroSocio) {
        for (SocioEstandarModelo socio : sociosEst) {
            if (socio.getN_socio() == numeroSocio) {
                return socio;
            }
        }
        return null; // Retorna null si no se encuentra ningún socio con el número especificado
    }
    // Otros métodos para manejar las demás opciones del menú de socios
}