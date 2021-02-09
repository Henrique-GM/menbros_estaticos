/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotacao_Dolar;

import entidades_Cotacao_Dolar.Entidades_Cotacao_Dolar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Cotacao_Dolar {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual é o preço do dolar? ");
        double precoDolar = sc.nextDouble();
        
        System.out.print("Quantos dolares você vai compra? ");
        double quantidadeDolar = sc.nextDouble();
        
        System.out.printf("Convertido para reais: %.2f", 
            Entidades_Cotacao_Dolar.convercaoDolar(precoDolar, quantidadeDolar)); 
        
        sc.close();
    }
}
