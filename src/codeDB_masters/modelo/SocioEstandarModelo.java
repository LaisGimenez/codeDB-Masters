package codeDB_masters.modelo;

import codeDB_masters.modelo.SeguroModelo;
import codeDB_masters.modelo.SociosModelo;

public class SocioEstandarModelo extends SociosModelo {
    //Atributos
    String nif;
    SeguroModelo seguro;

    //Constructor

    public SocioEstandarModelo(String n_socio, String nombre, String nif, SeguroModelo seguro) {
        super(n_socio, nombre);
        this.nif = nif;
        this.seguro = seguro;
    }


    //Getters y Setters

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public SeguroModelo getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroModelo seguro) {
        this.seguro = seguro;
    }
}
