/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoExcepciones;

/**
 *
 * @author DELL
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LongitudFueraDeRangoException {
        if (nombre.length() >= 10 && nombre.length() <= 20) {
            this.nombre = nombre;
        } else {
            throw new LongitudFueraDeRangoException();
        }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >= 20 && edad <= 35) {
            this.edad = edad;
        } else {
            throw new Exception("La edad de la persona debe ser entre 20 y 35 años");
        }

    }

}
