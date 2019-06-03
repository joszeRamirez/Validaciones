/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoExcepciones;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ManejoExcepciones {

    public static void main(String[] args) {
        Persona persona = new Persona();
        VentanaCrearPersona ventana = new VentanaCrearPersona(persona);
        ventana.setVisible(true);
        

        /*try {
            persona.setNombre("Juanito Jorgito");
            persona.setEdad(25);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }*/
 /*int[] vector = new int[10];
        int pos = 0;
        int valor = 0;
        int cont = 0;
        while (cont < 10) {
            Scanner scan = new Scanner(System.in);
            try {

                System.out.println("Ingrese la posición donde introducirá el valor:");
                pos = scan.nextInt();
                int i = pos - 1;
                System.out.println("Ingr1ese el valor:");
                valor = scan.nextInt();
                if (vector[i] == 0) {
                    vector[i] = valor;
                    cont++;
                }

            } catch (java.util.InputMismatchException exc) {
                cont--;
                System.err.println("el valor ingresado debe ser un entero");
                System.out.println(exc.toString());
            } catch (IndexOutOfBoundsException ex) {
                System.err.println("La posición ingresada está fuera del rango");
                cont--;
                //System.out.println(ex.getMessage());
                System.out.println(ex.toString());
                //ex.printStackTrace();
            }

        }
        System.out.println("Resultado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }*/
    }
}
