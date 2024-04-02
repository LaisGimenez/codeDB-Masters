package codeDB_masters.modelo;

public class SociosModelo {
    //Atributos
    String n_socio;
    String nombre;

    //Constructor

    public SociosModelo(String n_socio, String nombre) {
        this.n_socio = n_socio;
        this.nombre = nombre;
    }

    //Getters y Setters

    public String getN_socio() {
        return n_socio;
    }

    public void setN_socio(String n_socio) {
        this.n_socio = n_socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
