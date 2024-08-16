/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_17;

/**
 *
 * @author edmun
 */
import java.util.Scanner;

public class Atividade_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma frase:");
        String frase = ler.nextLine();
        int contador_vogal = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador_vogal++;
            }
            if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
                contador_vogal++;
            }
            if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I') {
                contador_vogal++;
            }
            if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O') {
                contador_vogal++;
            }
            if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
                contador_vogal++;
            }
        }
        System.out.println("Teve "+contador_vogal+" vogais na frase (ou palavra)");
    }
}
