package codeDB_masters.modelo;

import codeDB_masters.modelo.ExcursionesModelo;
import codeDB_masters.vista.InscripcionesVista;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InscripcionesModelo {
    private List<InscripcionesModelo> inscripciones;

    // Constructor
    public InscripcionesModelo() {
        this.inscripciones = new ArrayList<>();
    }

    // Método para agregar una nueva inscripción
    public void agregarInscripcion(InscripcionesModelo inscripcion) {
        this.inscripciones.add(inscripcion);
    }

    // Método para eliminar una inscripción
    public boolean eliminarInscripcion(InscripcionesModelo inscripcion) {
        return this.inscripciones.remove(inscripcion);
    }

    // Método para mostrar inscripciones filtradas por fechas y/o socios
    public List<InscripcionesModelo> mostrarInscripcionesFiltradas(Date fechaInicio, Date fechaFin, String numeroSocio) {
        List<InscripcionesModelo> inscripcionesFiltradas = new ArrayList<>();
        for (InscripcionesModelo inscripcion : inscripciones) {
            // Filtrar por fecha
            if (fechaInicio != null && fechaFin != null) {
                if (!inscripcion.getFechaExcursion().before(fechaInicio) && !inscripcion.getFechaExcursion().after(fechaFin)) {
                    continue;
                }
            }
            // Filtrar por número de socio
            if (numeroSocio != null && !numeroSocio.isEmpty()) {
                if (!inscripcion.getn_socio().equals(numeroSocio)) {
                    continue;
                }
            }
            inscripcionesFiltradas.add(inscripcion);
        }
        return inscripcionesFiltradas;
    }

}