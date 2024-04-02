package codeDB_masters.modelo;

import java.util.Date;

public class ExcursionesModelo {

    // atributos
    public String codigo;
    public String descripcion;
    public Date fecha;
    public int n_dias;
    public double precio;

    //constructor
    public ExcursionesModelo(String codigo, String descripcion, Date fecha, int n_dias, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.n_dias = n_dias;
        this.precio = precio;
    }

    //getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getN_dias() {
        return n_dias;
    }

    public void setN_dias(int n_dias) {
        this.n_dias = n_dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
