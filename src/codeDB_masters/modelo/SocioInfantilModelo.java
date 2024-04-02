package codeDB_masters.modelo;

import codeDB_masters.modelo.SociosModelo;

public class SocioInfantilModelo extends SociosModelo {
    //Atributos
    SociosModelo n_socioPadreMadre;
    int descuento_cuota;

    //Constructor

    public SocioInfantilModelo(int n_socio, String nombre, SociosModelo n_socioPadreMadre, int descuento_cuota) {
        super(n_socio, nombre);
        this.n_socioPadreMadre = n_socioPadreMadre;
        this.descuento_cuota = descuento_cuota;
    }


    //Getters y Setters

    public SociosModelo getN_socioPadreMadre() {
        return n_socioPadreMadre;
    }

    public void setN_socioPadreMadre(SociosModelo n_socioPadreMadre) {
        this.n_socioPadreMadre = n_socioPadreMadre;
    }

    public int getDescuento_cuota() {
        return descuento_cuota;
    }

    public void setDescuento_cuota(int descuento_cuota) {
        this.descuento_cuota = descuento_cuota;
    }
}
