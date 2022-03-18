/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Random;

/**
 *
 * @author Javie
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int dui;
    private char sexo;
    private double altura;
    private double peso;
    Random aleatorio = new Random();

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        
        this.sexo = 'h';
        this.altura = 0;
        this.peso = 0;
        this.dui = generaDUI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = 0;
        this.peso = 0;
        this.dui = generaDUI();
    }
     
        
    public Persona(String nombre, int edad, int dui, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dui = dui;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    
    public int calcularIMC() {
        
        double IMC;
        IMC = peso/ (altura*altura);
        if (IMC<20) {
            return -1;
            
        } else if (IMC>=20 && IMC<=25) {
            return 0;
        } else {
            return 1;
        }
        
    }
    
    public boolean esMayorDeEdad(int edad) {
        if (edad>=18) {
            return true;
        }else{
            return false;
        }
    }
    
    private boolean comprobarSexo(char sexo){
        if (sexo == 'h' || sexo == 'm') {
            return true;
        }else{
            return false;
        }
    }
    
    private int generaDUI(){
        int duiGenerar=aleatorio.nextInt(90000)+10000;
        //duiGenerar= aleatrio.
        return duiGenerar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }
    
    @Override
    public String toString(){
        return "Persona{" + "nombre= " + nombre + " edad= " + edad + " sexo= " + sexo + " peso= " + peso
                + " altura= " + altura + " DUI= " + dui + " aleatorio = " +aleatorio + '}';
    }
    
}
