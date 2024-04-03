package codeDB_masters.controlador;


//importamos librerías

import codeDB_masters.modelo.CargarDatos;
import codeDB_masters.modelo.Datos;
import codeDB_masters.modelo.CargarDatos;
import codeDB_masters.vista.AppmenuVista;

public class App_controlador {

    static AppmenuVista View = new AppmenuVista();
    static boolean cerrarApp = false;

    public static void DatosControlador(Datos BBDD) {

        CargarDatos cargardatos = new CargarDatos();
        cargardatos.cargardatos(BBDD);  //HABRÍA QUE CREAR EL MÉTODO CARGAR DATOS EN LA CLASE DATOS
    }

    //Inicio del menú de la app

    public static void inicio(Datos BBDD) {

        //arranca el menú principal de la app

        do {
            View.menuInicioVista();
            int opcion = View.getOpcionVista(4);
            switch (opcion) {
                case 1:
                    gestionExcursiones(BBDD);
                    break;
                case 2:
                    gestionSocios(BBDD);
                    break;
                case 3:
                    gestionInscripciones(BBDD);
                    break;
                case 4:
                    cerrarApp = true;
                    break;
            }
        } while(!cerrarApp);
    }

    //MÉTODOS CONTROL PARA EXCURSIONES

    public static void gestionExcursiones(Datos BBDD) {
        ExcursionesControlador excursionescontrolador = new ExcursionesControlador();

        View.menuGestionExcursionesVista();
        int opcion = View.getOpcionVista(3);
        switch (opcion) {
            case 1:
                excursionescontrolador.agregarExcursion(BBDD); //BBDD  tendrá que ser una instancia de la clase Datos
                break;
            case 2:
                excursionescontrolador.mostrarExcursionesFiltradas(BBDD);
                break;
            case 3:
                inicio(BBDD);
                break;
        }
    }

    //MÉTODOS CONTROL PARA SOCIOS

    public static void gestionSocios(Datos BBDD) {

        View.menuGestionSociosVista();
        int opcion = View.getOpcionVista(6);
        switch (opcion) {
            case 1:
                SociosControlador.agregarSocio(BBDD);   //CREAR MÉTODO agregarSocio
                break;
            case 2:
                SociosControlador.modificarSeguro(BBDD);    //CREAR MÉTODO modificarSeguro
                break;
            case 3:
                SociosControlador.mostrarSocio(BBDD);   //CREAR MÉTODO mostrarSocio
                break;
            case 4:
                SociosControlador.eliminarSocio(BBDD);  //CREAR MÉTODO eliminarSocio
                break;
            case 5:
                SociosControlador.Facturamensualsocio(BBDD);  //CREAR MÉTODO Facturamensualsocio
                break;
            case 6:
                inicio(BBDD);
                break;
        }
    }

    //MÉTODOS CONTROL PARA INSCRIPCIONES. Lo hacemos de la siguiente manera porque los métodos de instancia
    //no pueden ser llamados en un contexto estático

    public static void gestionInscripciones(Datos BBDD) {
        InscripcionesControlador inscripcionesControlador = new InscripcionesControlador();

        View.menuGestionInscripcionesVista();
        int opcion = View.getOpcionVista(4);
        switch (opcion) {
            case 1:
                inscripcionesControlador.agregarInscripcion();  // Método de instancia
                break;
            case 2:
                inscripcionesControlador.mostrarInscripcion();  // Método de instancia
                break;
            case 3:
                inscripcionesControlador.eliminarInscripcion();  // Método de instancia
                break;
            case 4:
                inicio(BBDD);
                break;
        }
    }

}
