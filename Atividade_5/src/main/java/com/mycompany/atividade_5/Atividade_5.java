/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira um numero para mostrar a tabuada de 1 a 10:");
        int num = ler.nextInt();
        int operacao;
        for (int i = 1; i < 11; i++) {
            operacao = num * i;
            System.out.println(num+" * "+i+" = "+operacao);
        }
    }
}
