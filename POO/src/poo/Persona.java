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
public class Persona {
    
    //ATRIBUTOS
    String nombre;
    int edad;
    String ciudadResidencia;
    String profesion;
    String dni;
    
    //CONSTRUCTOR
    
    public Persona(String s, int n, String d){
        
        nombre = s;
        edad = n;
        ciudadResidencia = "sin ciudad";
        profesion = "sin profesion";
        dni = d;
        
    }
    
    //METODOS
    public void mostrarDatos(){
        
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Ciudad: "+ciudadResidencia);
        System.out.println("Profesión: "+profesion);
        System.out.println("");
        
    }
}
