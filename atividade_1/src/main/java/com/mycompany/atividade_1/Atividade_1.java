/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_1;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Atividade_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira a primeira nota do aluno:");
        float nota_1 = ler.nextFloat();
        System.out.print("Insira a segunda nota do aluno:");
        float nota_2 = ler.nextFloat();
        System.out.print("Insira a terceira nota do aluno:");
        float nota_3 = ler.nextFloat();
        
        float media = (nota_1 + nota_2 + nota_3)/3;
        
        if(media <= 5){
            System.out.print("Reprovado! Media:"+media);
        }else if(media <= 7){
            System.out.print("Recuperacao! Media:"+media);
        }else{
            System.out.print("Aprovado! Media:"+media);
        }
    }
}
