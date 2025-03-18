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
        
        Persona p1 = new Persona("Pepe",40,"202020A","Granada","Abogado");
        Persona p2 = new Persona("Marta",25,"303030B","Valencia","Enfermera");
       
        p2.establecerEdad(34);

        CuentaBancaria cuenta1 = new CuentaBancaria(1,p1);
        CuentaBancaria cuenta2 = new CuentaBancaria(2,p2);
        
        cuenta1.ingresar(100);
        cuenta2.ingresar(200);

        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();
    }
    
}
