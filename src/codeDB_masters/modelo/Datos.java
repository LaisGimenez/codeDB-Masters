package codeDB_masters.modelo;

import java.util.ArrayList;

public class Datos {

    ArrayList<ExcursionesModelo> excursiones;
    ArrayList<SocioInfantilModelo> socioInfantil;
    ArrayList<SocioEstandarModelo> socioEstandar;
    ArrayList<SociosFederadosModelo> socioFederado;
    ArrayList<InscripcionesModelo> inscripciones;
    ArrayList<FederacionesModelo> federaciones;

    public Datos() {

        excursiones = new ArrayList<>();
        socioInfantil = new ArrayList<>();
        socioEstandar = new ArrayList<>();
        socioFederado = new ArrayList<>();
        inscripciones = new ArrayList<>();
        federaciones = new ArrayList<>();
    }
}
