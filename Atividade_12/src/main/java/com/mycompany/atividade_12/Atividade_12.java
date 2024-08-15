/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_12;

/**
 *
 * @author castr
 */
import java.util.Scanner;

public class Atividade_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int Mykael = 0;
        int Gregory = 0;
        int Ramon = 0;
        
        System.out.print("Digite quantos eleitores vao votar:");
        int Numero_Eleitores = ler.nextInt();
        
        for (int i = 0; i < Numero_Eleitores; i++) {
            int voto = 0;
            
            while(voto > 3 || voto < 1){
                
                System.out.print("#"+(i+1)+" - Escolha seu voto (1 - Mykael/ 2 - Gregory/3 - Ramon):");
                voto = ler.nextInt();
                
                if (voto == 1) {
                    Mykael++;
                }else if(voto == 2){
                    Gregory++;
                }else if (voto == 3){
                    Ramon++;
                }else{
                    System.out.println("Canditato Invalido");
                }
            }
        }
        System.out.println("Quantidade de votos em Mykael:"+Mykael);
        System.out.println("Quantidade de votos em Gregory:"+Gregory);
        System.out.println("Quantidade de votos em Ramon:"+Ramon);
        if(Mykael > Gregory && Mykael > Ramon){
            System.out.println("Mykael Ganhou!");
        }else if(Gregory > Mykael && Gregory > Ramon){
            System.out.println("Gregory Ganhou!");
        }else if(Ramon > Gregory && Ramon > Mykael){
            System.out.println("Ramon Ganhou");
        }else{
            System.out.println("Houve empate");
        }
    }
}
