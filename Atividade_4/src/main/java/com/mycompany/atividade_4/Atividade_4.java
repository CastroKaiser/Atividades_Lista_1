/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_4;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Login:");
        String login = ler.next();
        System.out.print("Senha:");
        int senha = ler.nextInt();
        
        String login_pre_definido =  "Castro";
        int senha_pre_definida = 1234;
        int contador = 3;
        
        while(contador > 0){
            if ((senha != senha_pre_definida) && (login != login_pre_definido)) {
                System.out.println("Chances:"+contador);
                System.out.println("Senha Errada");
                System.out.println("Insira novamente a senha");
                contador--;
                senha = ler.nextInt();
            }else{
                contador = 0;
            }
        }
    }
}
