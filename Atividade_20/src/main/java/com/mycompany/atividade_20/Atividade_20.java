/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_20;
import java.util.Scanner;
/**
 *
 * @author edmun
 */
public class Atividade_20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor_compra = ler.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentual_desconto = ler.nextDouble();

        if (percentual_desconto >= 0 && percentual_desconto <= 100) {
            double valor_desconto = valor_compra * (percentual_desconto / 100);

            double valor_final = valor_compra - valor_desconto;

            System.out.println("O valor final após aplicar o desconto é: R$ " + valor_final);
        } else {
            System.out.println("Percentual de desconto inválido! Deve estar entre 0 e 100.");
        }
    }
}
