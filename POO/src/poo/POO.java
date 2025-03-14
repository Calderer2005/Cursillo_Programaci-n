/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author EAG
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pepe",40,"202020A");
        Persona p2 = new Persona("Marta",25,"303030B");
        
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
    
}
