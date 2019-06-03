/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoExcepciones;

/**
 *
 * @author Eduardo Ayora
 */
public class NombreApellidoIncompletosException extends Exception{

    public NombreApellidoIncompletosException() {
        
        super("No ha ingresado sus dos nombres o apellidos completos");
        
    }
    
    
    
}
