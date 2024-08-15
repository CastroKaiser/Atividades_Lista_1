/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_11;

/**
 *
 * @author castr
 */
import java.util.Scanner;
public class Atividade_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String Unidade_Origem = "";
        
        System.out.print("Insira uma temperatura:");
        float temperatura = ler.nextFloat();
        do{
            
            System.out.print("Insira a unidade de medida dessa temperatura(C - Celsius/F - Fahrenheit):");
            Unidade_Origem = ler.next();
            
        }while(!Unidade_Origem.equals("C") && !Unidade_Origem.equals("F"));
        
        if (Unidade_Origem.equals("C")) {
            float fahrenheit = (9.0f /5.0f * temperatura) + 32;
            System.out.println("Apos a conversao temos "+fahrenheit+" fahrenheit");
        }else{
            float Celsius = (temperatura - 32) * 5.0f/9.0f;
            System.out.println("Apos a conversao temos "+Celsius+" celsius");
        }
    }
}
