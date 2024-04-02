package codeDB_masters.controlador;

import codeDB_masters.modelo.InscripcionesModelo;
import codeDB_masters.vista.InscripcionesVista;

public class InscripcionesControlador {
    //Atributos

    InscripcionesModelo modeloInsc;
    InscripcionesVista vistaInsc;

    //Constructor

    public InscripcionesControlador(InscripcionesModelo modeloInsc, InscripcionesVista vistaInsc) {
        this.modeloInsc = modeloInsc;
        this.vistaInsc = vistaInsc;
    }

    //Metodos
    void añadir_inscripcion(){}
    void eliminar_inscripcion(){}
}
