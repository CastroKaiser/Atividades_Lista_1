/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_18;

/**
 *
 * @author edmun
 */
import java.util.Scanner;

public class Atividade_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero referente ao veiculo de escolha:");
        System.out.println("1 - Carro | 2 - Moto | 3 - Caminhao");
        System.out.println("Tabela de preco:");
        System.out.println("Carro: R$2,60");
        System.out.println("Moto: R$1,50");
        System.out.println("Caminhao: R$4,30");
        System.out.print("ESCOLHA: ");
        int escolha = ler.nextInt();
        
        if (escolha == 1) {
            System.out.println("O valor a ser pago R$2,60");
        }else if(escolha == 2){
            System.out.println("O valor a ser pago R$1,50");
        }else{
            System.out.println("O valor a ser pago R$4,30");
        }
    }
}
