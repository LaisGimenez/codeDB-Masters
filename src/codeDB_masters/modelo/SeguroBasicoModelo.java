package codeDB_masters.modelo;

public class SeguroBasicoModelo extends SeguroModelo {
    //Atributos
    String tipo;
    double precio;

    //Constructor
    public SeguroBasicoModelo(String tipo, double precio) {
        tipo = "Básico";
        precio = 50;
    }
    //El precio del seguro no se especifica, por lo que por el momento será 50 euros.
}
