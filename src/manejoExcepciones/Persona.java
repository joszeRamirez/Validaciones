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

    public void setCedula(String cedula) throws ValidacionDeCedula {

        if (cedula.length() == 10) {
            int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
            if (tercerDigito < 6) {
                int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int verificador = Integer.parseInt(cedula.substring(9, 10));
                int suma = 0;
                int digito = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                    suma += ((digito % 10) + (digito / 10));
                }
                if ((suma % 10 == 0) && (suma % 10 == verificador)) {

                    this.cedula = cedula;
                } else if ((10 - (suma % 10)) == verificador) {

                    this.cedula = cedula;
                } else {

                    throw new ValidacionDeCedula();
                }
            } else {

                throw new ValidacionDeCedula();
            }
        } else {

            throw new ValidacionDeCedula();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreApellidoConNumeroException, NombreApellidoIncompletosException {
        boolean valido = true;
        boolean espacio = false;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.charAt(i) < 65 || nombre.charAt(i) > 90 && nombre.charAt(i) < 97 || nombre.charAt(i) > 122) && nombre.charAt(i) != 32) {
                valido = false;
            }
        }
        if (valido) {
            if (nombre.contains(" ")) {
                this.nombre = nombre;
            } else {
                throw new NombreApellidoIncompletosException();
            }
        } else {
            throw new NombreApellidoConNumeroException();
        }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        boolean valido = true;
        boolean espacio = false;
        for (int i = 0; i < apellido.length(); i++) {
            if ((apellido.charAt(i) < 65 || apellido.charAt(i) > 90 && apellido.charAt(i) < 97 || apellido.charAt(i) > 122) && apellido.charAt(i) != 32) {
                valido = false;
            }
        }
        if (valido) {
            if (apellido.contains(" ")) {
                this.apellido = apellido;
            } else {
                throw new NombreApellidoIncompletosException();
            }
        } else {
            throw new NombreApellidoConNumeroException();
        }

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
