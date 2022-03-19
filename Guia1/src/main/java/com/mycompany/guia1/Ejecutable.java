/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia1;

import Ejercicio2.Password;
import Ejercicio1.Persona;
/**
 *
 * @author Javie
 */
public class Ejecutable {

    public static void main(String[] args) {

        //Ejercicio 1
        Entrada entrada1 = new Entrada();

        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;

        //datos de usuario
        System.out.println("Obtencion de datos");
        System.out.println("------------------");
        nombre = entrada1.obtenerString("Dame el nombre de la persona:");
        edad = entrada1.obtenerEntero("Dame la edad de " + nombre);
        sexo = entrada1.obtenerString("Dime el sexo de " + nombre);
        peso = entrada1.obtenerFloat("Dime el peso de " + nombre);
        altura = entrada1.obtenerFloat("Dame la altura para " + nombre);
              
        ////////////////////////////////////////////////////////////////////
        
        //Ejercicio 2
        
        //Password pass()=new Password();
        Entrada entrada2 = new Entrada();
        int i;
        //entrada.obtenerEntero("Introduce la cantidad de Passwords")		
        Password[] passwd = new Password[5];
        for (i = 0; i < passwd.length; i++) {
            passwd[i] = new Password();
            passwd[i].setLongitud(entrada2.obtenerEntero("De que longitud quieres la contraseña numero " + (i + 1) + ": "));
        }
        System.out.println("Nº\tFortaleza\tContraseña");
        System.out.println("--------------------------------------");
        for (i = 0; i < passwd.length; i++) {
            passwd[i].generarPassword();
            System.out.printf("%s\t%s\t\t%s%n", (i + 1), passwd[i].esFuerte(), passwd[i].getContraseña());
        }

    }
}
    

   
