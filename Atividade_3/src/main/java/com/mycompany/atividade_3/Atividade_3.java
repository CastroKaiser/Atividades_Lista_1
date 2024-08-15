/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_3;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;
public class Atividade_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o numero referente a escolha:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        int escolha = ler.nextInt();
        
        System.out.print("Insira um numero para realizar a operacao escolhida:");
        float num_1 = ler.nextFloat();
        System.out.print("Insira outro numero para realizar a operacao escolhida:");
        float num_2 = ler.nextFloat();
        
        if (escolha == 1) {
            System.out.println(soma(num_1, num_2));
        }else if(escolha == 2){
            System.out.println(subtracao(num_1,num_2));
        }else if(escolha == 3){
            System.out.println(multiplicacao(num_1,num_2));
        }else{
            System.out.println(divisao(num_1, num_2));
        }
        
    }
    public static float soma(float num_1, float num_2){
        return num_1 + num_2;
    }
    public static float subtracao(float num_1, float num_2){
        return num_1 - num_2;
    }
    public static float multiplicacao(float num_1, float num_2){
        return num_1 * num_2;
    }
    public static float divisao(float num_1, float num_2){
        return num_1/num_2;
    }
}
