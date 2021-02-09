/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

/**
 *
 * @author Henrique
 */
public class Calculador {
    
    //atribuindo menbros estaticos e constante
    public static final double PI = 3.14159;
    
    public static double circuferencia(double raio) {
        return 2.0 * PI * raio;
    }
    
    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
