package com.bedoya.esau.list_2;

/**
 * Created by ESAU on 19/04/2016.
 */
public class Lista_Entrada {

    private int idImagen;
    private String nombre, nombrePila, fecha;

    public Lista_Entrada(int idImagen, String nombre, String nombrePila, String fecha) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.nombrePila = nombrePila;
        this.fecha = fecha;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombrePila() {
        return nombrePila;
    }
}
