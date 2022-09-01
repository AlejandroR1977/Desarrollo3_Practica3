/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo3_practica3_3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n;
        System.out.println("Introduce un valor");
        n = teclado.nextInt();
        if(n>0){
            System.out.println("La raiz es: " + Math.sqrt(n));
        }
    }
}
    