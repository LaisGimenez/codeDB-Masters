package codeDB_masters.modelo;

public class SeguroCompletoModelo extends SeguroModelo {
    //Atributos
    String tipo;
    double precio;

    //Constructor
    public SeguroCompletoModelo(String tipo, double precio) {
        tipo = "Completo";
        precio = 100;
    }
    //El precio del seguro no se especifica, por lo que por el momento será 100 euros.
}
