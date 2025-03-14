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
    private int edad;
    String ciudadResidencia;
    String profesion;
    String dni;
    
    //CONSTRUCTOR
    
    public Persona(String s, int n, String d, String c, String p){
        
        nombre = s;
        edad = n;
        ciudadResidencia = c;
        profesion = p;
        dni = d;

    }
    
    //METODOS
    public void establecerEdad(int n){
        if(n>=0) edad = n;
        else System.out.println("No se pueden poner edades negativas");
    }
    
    public void mostrarDatos(){
        
        System.out.println("");
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Ciudad: "+ciudadResidencia);
        System.out.println("Profesión: "+profesion);
        
    }
}
