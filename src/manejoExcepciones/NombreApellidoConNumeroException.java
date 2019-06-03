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
public class NombreApellidoConNumeroException extends Exception{
    
    public NombreApellidoConNumeroException(){
        
        super("Ha ingresado un valor numérico en su nombre o apellido");
        
    }
    
}
