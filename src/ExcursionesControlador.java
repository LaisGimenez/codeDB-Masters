import java.time.LocalDate;
import java.util.ArrayList;

public class ExcursionesControlador {

    //Atributos para relacionar la vista con el arraylist de excursiones
    private ExcursionesVista vistaEx;
    private ArrayList<ExcursionesModelo> excursiones;

    //Controlador
    //Al iniciar el controlador iniciamos la vista y el arraylist
    public ExcursionesControlador() {
        this.vistaEx = new ExcursionesVista();
        this.excursiones = new ArrayList<>();
    }

    //Menú interno para seleccionar qué método se ejecutará una vez la vista haya pedido al usuario que seleccione una opción.
    public void iniciar(){
        int opcion;
        do {
            //Aqui se extrae la opción de la vista
            opcion = vistaEx.mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarExcursion();
                    break;
                case 2:
                    mostrarExcursionesFiltradas();
                    break;
                case 0:
                    System.out.println("Saliendo del menú de Excursiones...");
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca una opción válida.");
            }
        } while (opcion != 0);
    }
    //Gracias a los datos introducidos por el usuario, el controlador añade el nuevo objeto de excursiones al arraylist
    public void agregarExcursion(){
        ExcursionesModelo excursion = vistaEx.DatosExcursion();
        excursiones.add(excursion);
        //Debería tener en cuenta posibles errores
        vistaEx.mostrarMensaje("Excursión añadida correctamente.");
    }

    //Función para añadir excursiones creadas en el MAIN, NO INTRODUCIDAS POR EL USUARIO EN LA VISTA.
    public void addExcursion(ExcursionesModelo excursion){
        excursiones.add(excursion);
    }

    //Iteramos sobre los objetos del arraylist para comprobar su fecha, si se encuentra entre las dos fechas facilitadas,
    // se imprimen por pantalla gracias a la función mostrarExcursion de la vista.
    public void mostrarExcursionesFiltradas(){
        LocalDate[] fechas = vistaEx.ExcursionesFechasFiltro();
        LocalDate fechaInicio = fechas[0];
        LocalDate fechaFinal = fechas[1];

        vistaEx.mostrarMensaje("Excursiones entre " + fechaInicio + " y " + fechaFinal + ":");
        //Quizás prodía hacerse mas sencillo utilizando isEqual, isAfter, isBefore, lo probaré.
        for (ExcursionesModelo excursion : excursiones) {
            LocalDate fechaExcursion = excursion.getFecha();
            if ((fechaExcursion.compareTo(fechaInicio) >= 0 && fechaExcursion.compareTo(fechaFinal) <= 0)) {
                vistaEx.mostrarExcursion(excursion);
            }
        }
    }
}
