/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog3;

import java.util.Scanner;

/**
 *
 * @author Henrique
 * 1 - Crie um programa que receba dois números inteiros e exiba qual deles é o menor;
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        
        if (primeiroNumero < segundoNumero){
            System.out.println(primeiroNumero);
        }
        else if (primeiroNumero == segundoNumero){
            System.out.println("Numeros iguais");
        }
        else 
            System.out.println(segundoNumero);

    }

}
