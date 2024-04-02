package codeDB_masters.vista;

import java.util.Scanner;
import java.util.Date;

public class InscripcionesVista {

    private Scanner scanner;

    public InscripcionesVista() {
        scanner = new Scanner(System.in);
    }

    public class DatosInscripcion {
        private String n_socio;
        private String nombre;
        private Date fechaExcursion;
        private String descripcion;
        private double importe;

        public DatosInscripcion(String n_socio, String nombre, Date fechaExcursion, String descripcion, double importe) {
            this.n_socio = n_socio;
            this.nombre = nombre;
            this.fechaExcursion = fechaExcursion;
            this.descripcion = descripcion;
            this.importe = importe;
        }

        public String getn_socio() {
            return n_socio;
        }

        public String getNombre() {
            return nombre;
        }

        public Date getFechaExcursion() {
            return fechaExcursion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getImporte() {
            return importe;
        }
    }
}

