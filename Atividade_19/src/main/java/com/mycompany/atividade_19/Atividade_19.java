/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_19;

/**
 *
 * @author edmun
 */
import java.util.Scanner;
public class Atividade_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira um numero para a base:");
        int base = ler.nextInt();
        System.out.print("Insira um numero para o expoente:");
        int expoente = ler.nextInt();
        int resultado = 1;
        
        for (int i = 0; i < expoente; i++) {
           resultado *= base;   
        }
        
        System.out.println("O resultado de " + base + "^" + expoente + " e: " + resultado);
    }
}
