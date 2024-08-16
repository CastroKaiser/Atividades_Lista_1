/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_16;

/**
 *
 * @author edmun
 */
import java.util.Scanner;

public class Atividade_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = ler.nextLine();
        
        boolean Palindromo = true;
        
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                Palindromo = false;
                break; 
            }
        }

        if (Palindromo) {
            System.out.println("A palavra '" + palavra + "' e um palindromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' nao e um palindromo.");
        }
    }
}

