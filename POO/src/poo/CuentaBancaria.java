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
public class CuentaBancaria {
    
    //ATRIBUTOS
    
    int id;
    private double saldo;
    Persona propietario;
    String tipo;
    
    //CONSTRUCTOR
    
    public CuentaBancaria(int num, Persona p){
        id = num;
        saldo = 0;
        propietario = p;
        tipo = " Corriente ";
        
    }
    
    //METODOS
    
    public void verSaldo(){
        System.out.println("El saldo de la cuenta "+id+" es: "+saldo+" $");
    }
    
    public void ingresar(double n){
        saldo +=n;
    }
    
    public void retirar(double n){
        if(saldo>=n)saldo -=n;
        else System.out.println("ERROR: No hay suficiente saldo");
    }
    
    public void mostrarDatos(){
        System.out.println("PROPIETARIO:");
        propietario.mostrarDatos();
        verSaldo();
        System.out.println("-----------------------------------------");
        
    }
    
}
