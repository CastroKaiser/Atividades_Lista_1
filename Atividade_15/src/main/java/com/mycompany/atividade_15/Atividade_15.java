/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_15;

/**
 *
 * @author edmun
 */
import java.util.Scanner;

public class Atividade_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero para calcular o fatorial: ");
        int numero = ler.nextInt();
        
        long fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; 
        }
        
        System.out.println("O fatorial de " + numero + " e: " + fatorial);
    }
}
