/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_7;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Atividade_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira um numero:");
        int numero = ler.nextInt();
        int par = 0;
        int impar = 0;
        
        for (int i = 0; i < numero; i++){
            
            if(i % 2 == 0){
                par++;
            }else{
                impar++;
            }
            
        }
        System.out.println("A quantidade de par sao:"+par);
        System.out.println("A quantidade de impares sao:"+impar);
  
    }
}
