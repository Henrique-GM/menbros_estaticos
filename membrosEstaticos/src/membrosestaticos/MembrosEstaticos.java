/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membrosestaticos;

import java.util.Locale;
import java.util.Scanner;
import utilitario.Calculador;

/**
 *
 * @author Henrique
 */
public class MembrosEstaticos {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o raio: ");
        double raio = sc.nextDouble();
        
        double c = Calculador.circuferencia(raio);
            
        double v = Calculador.volume(raio);
        
        System.out.printf("Circuferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("valor de PI: %.2f\n", Calculador.PI);
        
        sc.close();
    }     
}
