/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.*;


/**
 *
 * @author Javie
 */
public class Password {
    
    
        private final static int Longitud_8 = 8;
	private final static int Mayusculas = 2;
	private final static int Minusculas = 1;
	private final static int Numeros = 4;

	private int longitud;
	private String contraseña;

	public Password() {
		this.longitud = Longitud_8;
		this.contraseña = generarPassword();
	}

	public void setLongitud(int longitud) {

		this.longitud = longitud;

	}

	public int getLongitud() {

		return this.longitud;

	}

	public String getContraseña() {
		return this.contraseña;
	}

	public String generarPassword() {

		contraseña = "";
		for (int i = 0; i < this.longitud; i++) {

			switch ((int) (Math.random() * 3)) {
			case 0:
				contraseña += (char) (Math.random() * 26 + 'A');
				break;
			case 1:
				contraseña += (char) (Math.random() * 26 + 'a');
				break;
			case 2:
				contraseña += (char) (Math.random() * 10 + '0');
				break;
			}
		}

		return contraseña;
	}

	public boolean esFuerte() {
		int mayusculas = 0, minusculas = 0, numeros = 0;

		for (int i = 0; i < this.longitud; i++) {
			if (this.contraseña.charAt(i) >= 'A' && this.contraseña.charAt(i) <= 'Z')
				mayusculas++;
			if (this.contraseña.charAt(i) >= 'a' && this.contraseña.charAt(i) <= 'z')
				minusculas++;
			if (this.contraseña.charAt(i) >= '0' && this.contraseña.charAt(i) <= '9')
				numeros++;
		}
		return (mayusculas > Mayusculas && minusculas > Minusculas && numeros > Numeros)
				? true : false;
	}   
   
}


