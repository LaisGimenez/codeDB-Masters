package codeDB_masters.modelo;

import java.time.LocalDate;

public class InscripcionesModelo {

    // Atributos
    private String nSocio;
    private String nombre;
    private LocalDate fechaExcursion;
    private String descripcion;
    private double importe;

    // Constructor
    public InscripcionesModelo(String nSocio, String nombre, LocalDate fechaExcursion, String descripcion, double importe) {
        this.nSocio = nSocio;
        this.nombre = nombre;
        this.fechaExcursion = fechaExcursion;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    // Getters y setters
    public String getNSocio() {
        return nSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaExcursion() {
        return fechaExcursion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }
}
