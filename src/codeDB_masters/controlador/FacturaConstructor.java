package codeDB_masters.controlador;

import codeDB_masters.modelo.FacturaModelo;

public class FacturaConstructor {
    //Atributos

    FacturaModelo modeloFac;
    FacturaVista vistaFac;

    //Contructor

    public FacturaConstructor(FacturaModelo modeloFac, FacturaVista vistaFac) {
        this.modeloFac = modeloFac;
        this.vistaFac = vistaFac;
    }

    //Metodos

    void generar_factura(){}
}
