/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_8;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Atividade_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Senha:");
        String senha = ler.next();
        int comprimento = senha.length();
        while(comprimento != 8){
            
            if(senha.length() != 8){
                System.out.println("Senha pequena, tente novamente");
                System.out.print("Senha:");
                senha = ler.next();
            }
            comprimento = senha.length();
        }
        
    }
}
