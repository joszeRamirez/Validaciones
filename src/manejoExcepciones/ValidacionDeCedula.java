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
public class ValidacionDeCedula extends Exception {

    public ValidacionDeCedula() {
        super("El número de cédula es inválido");
    }

}
