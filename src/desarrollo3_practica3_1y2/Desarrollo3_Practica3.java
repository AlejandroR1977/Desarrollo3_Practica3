/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo3_practica3_1y2;

import java.util.Scanner;


public class Desarrollo3_Practica3 {
    public static void main(String[] args) {
 
		Scanner teclado = new Scanner(System.in);
 
		System.out.print("Cadena: ");
		String lect_teclado = teclado.nextLine();
		teclado.close();
 
		try {
			System.out.println("\nCarácter encontrado: " + caracterEn(lect_teclado, 7));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
 
	}
 
	public static char caracterEn(String cadena, int pos) throws Exception {
 
		if (pos < 0 || pos >= cadena.length())
			throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
		else
			return cadena.charAt(pos);
	}
 
}
