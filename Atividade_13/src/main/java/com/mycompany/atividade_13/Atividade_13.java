/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_13;

/**
 *
 * @author castr
 */
import java.util.Scanner;

public class Atividade_13 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " e um ano bissexto.");
        } else {
            System.out.println(ano + " nao e um ano bissexto.");
        }
    }
}
