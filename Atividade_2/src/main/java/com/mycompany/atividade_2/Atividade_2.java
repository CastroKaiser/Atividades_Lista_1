/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_2;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;
import java.util.Random;


public class Atividade_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gera = new Random();
        
        int numero_aleatorio = gera.nextInt(100);
        int numero = 0;
        
        while(numero != numero_aleatorio){
            System.out.println("Insira um numero para adivinhar:");
            numero = ler.nextInt();
            
            if (numero > numero_aleatorio) {
                System.out.println("O numero e menor");
            }else{
                System.out.println("O numero e maior");
            }
        }   
        
        if (numero == numero_aleatorio) {
            System.out.println("Parabens, voce acertou o numero!");
        }
        
        
    }
}
