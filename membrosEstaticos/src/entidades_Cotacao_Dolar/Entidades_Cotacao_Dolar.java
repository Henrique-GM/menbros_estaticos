/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_Cotacao_Dolar;

/**
 *
 * @author Henrique
 */
public class Entidades_Cotacao_Dolar {
    
    
    public static final double IOF = 0.06;
    
    public static double convercaoDolar(double precoDolar, double quantidadeDolar) {
        
        return (quantidadeDolar * precoDolar) + (quantidadeDolar * precoDolar * IOF);
    }    
}
