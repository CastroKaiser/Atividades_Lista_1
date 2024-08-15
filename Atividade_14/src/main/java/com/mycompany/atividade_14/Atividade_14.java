/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_14;

/**
 *
 * @author edmun
 */
import java.util.Scanner;
import java.util.Random;

public class Atividade_14 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         Random gerar = new Random();
         
         int numero_gerado = gerar.nextInt(100);
         
         System.out.print("Digite um numero:");
         int numero_escolhido = ler.nextInt();
         
         System.out.print("Digite PAR ou IMPAR:");
         String escolha = ler.next();
         
         if ((numero_gerado + numero_escolhido) % 2 == 0 && escolha.equals("PAR")) {
             System.out.println("VOCE GANHOU!");
             System.out.println("NUMERO GERADO:"+numero_gerado);
             System.out.println("NUMERO ESCOLHIDO:"+numero_escolhido);
             System.out.println("SOMA DOS NUMEROS:"+(numero_gerado+numero_escolhido));
        }else{
             System.out.println("O COMPUTADOR GANHOU!");
             System.out.println("NUMERO GERADO:"+numero_gerado);
             System.out.println("NUMERO ESCOLHIDO:"+numero_escolhido);
             System.out.println("SOMA DOS NUMEROS:"+(numero_gerado+numero_escolhido));
         }
         
         
         
    }
}
