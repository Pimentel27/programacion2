/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia1;

import Ejercicio2.Password;
import java.util.Scanner;

/**
 *
 * @author Javie
 */
public class Ejecutable {
    
    

   public static void main(String[]args){
      int numeroDePass;
      Scanner tec=new Scanner(System.in);
      System.out.println("Ingrese el numero de contraseñas a construir");
      numeroDePass=tec.nextInt();
      Password pass[]=new Password[numeroDePass];
      String cond,fuerte;
      int longitud;
   
      for(int i=0;i<numeroDePass;i++){
         System.out.println("Desea ingresar la longitud de la contraseña? ");
         cond=tec.next();
         if(cond.toLowerCase().equals("si")){
            System.out.println("Ingrese su longitud y se creara automaticamente su contraseña ");
            longitud=tec.nextInt();
            //pass = new Password(longitud);
            
         }else{
            //pass=new Password();
            System.out.println("Escriba su contraseña de  8 caracteres:");
            //pass.setContrasenia(tec.next());
         }
      }
      for(int i=0;i<numeroDePass;i++){
////         if(pass.isEsFuerte(pass.getContrasenia())==true){
////            fuerte="fuerte!";
////            
////         }else{
////            fuerte="debil";
////         }
////         
////         //System.out.println("la contraseña Nº: "+(i+1)+" es igual a: "+pass.getContrasenia()+" "+" " +fuerte);
////         
      }
      
   
   }

}
    

   
