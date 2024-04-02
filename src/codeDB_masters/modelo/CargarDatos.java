package codeDB_masters.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CargarDatos {
    public void cargardatos(Datos BBDD) {
        FileReader archivo;
        BufferedReader lector;
        try {
            File fichero = new File("codeDB-Masters\\src\\codeDB_masters\\modelo\\federaciones.txt");
            String ruta = fichero.getAbsolutePath();
            archivo = new FileReader(ruta);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) !=null) {
                    String[] lectura = cadena.split(",");
                    if (lectura.length ==2) {
                        String codigo = lectura[0].trim();
                        String nombre = lectura[1].trim();
                        FederacionesModelo federaciones = new FederacionesModelo(codigo,nombre);
                        BBDD.federaciones.add(federaciones);
                    }
                }
                lector.close();
            }
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File fichero = new File("codeDB-Masters\\src\\codeDB_masters\\modelo\\excursiones.txt");
            String ruta = fichero.getAbsolutePath();
            archivo = new FileReader(ruta);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) !=null) {
                    String[] packs = cadena.split(",");
                    if (packs.length ==5) {
                        String codigo = packs[0].trim();
                        String descripcion = packs[1].trim();
                        Date fecha = null;
                        int nDias = 0;
                        double precioinscripcion = 0.0;

                        try {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            fecha = sdf.parse(packs[2].trim());
                            nDias = Integer.parseInt(packs[3].trim());
                            precioinscripcion = Double.parseDouble(packs[4].trim());

                        }catch (ParseException | NumberFormatException e) {
                            System.out.println("Error al parsear la línea: " + cadena);
                            e.printStackTrace();
                        }
                        ExcursionesModelo excursiones = new ExcursionesModelo(codigo, descripcion,
                                fecha, nDias, precioinscripcion);
                        BBDD.excursiones.add(excursiones);

                    }else {
                        System.out.println("Error en el formato: " + cadena);
                    }

                }
                lector.close();
            }
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File fichero = new File("codeDB-Masters\\src\\codeDB_masters\\modelo\\socioEstandar.txt");
            String ruta = fichero.getAbsolutePath();
            archivo = new FileReader(ruta);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) !=null) {
                    String[] packs = cadena.split(",");
                    if (packs.length ==4) {
                        String n_socio = packs[0].trim();
                        String nombre = packs[1].trim();
                        String dni = packs[2].trim();
                        String seguro = packs[3].trim();

                        SeguroModelo.TipoSeguro tipoSeguro;
                        if (seguro.equals("BASICO")) {
                            tipoSeguro = SeguroModelo.TipoSeguro.BASICO;

                        } else if (seguro.equals("COMPLETO")) {
                            tipoSeguro = SeguroModelo.TipoSeguro.COMPLETO;
                        } else {  // y si no es válido?
                            System.out.println("Tipo de seguro no válido");
                            continue;
                        }

                        SocioEstandarModelo sociosEstandar = new SocioEstandarModelo(n_socio, nombre, dni,
                                new SeguroModelo());
                        BBDD.socioEstandar.add(sociosEstandar);

                    } else {
                        System.out.println("Error en el formato: " + cadena);
                    }

                }
                lector.close();
            }
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
