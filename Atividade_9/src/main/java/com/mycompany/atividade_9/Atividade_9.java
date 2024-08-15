/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_9;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Atividade_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();
        
        boolean primo = true;

        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false; 
                    break;
                }
            }
        }
        if (primo) {
            System.out.println(numero + " e um numero primo.");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }

        ler.close(); 
    }
}
