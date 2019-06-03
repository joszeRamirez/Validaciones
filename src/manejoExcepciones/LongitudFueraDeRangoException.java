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
public class LongitudFueraDeRangoException extends Exception {

    public LongitudFueraDeRangoException() {
        super("La longitud de nombre debe ser entre 20 y 50 caracteres");
    }
    
}
