/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog3;

import java.util.Scanner;

/**
 *
 * @author Henrique 2 - Crie um programa que receba cinco números inteiros e
 * exiba qual deles é o maior;
 */
public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("escreva o segundo numero: ");
        int segundoNumero = scanner.nextInt();
        System.out.println("escreva o terceiro numero: ");
        int terceiroNumero = scanner.nextInt();
        System.out.println("escreva o quarto numero: ");
        int quartoNumero = scanner.nextInt();
        System.out.println("escreva o quinto numero: ");
        int quintoNumero = scanner.nextInt();

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero
                && primeiroNumero >= quartoNumero && primeiroNumero >= quintoNumero) {
            System.out.println(primeiroNumero);

        } else if (primeiroNumero <= segundoNumero && segundoNumero >= terceiroNumero
                && segundoNumero >= quartoNumero && segundoNumero >= quintoNumero) {
            System.out.println(segundoNumero);
            
        } else if (primeiroNumero <= terceiroNumero && segundoNumero <= terceiroNumero
                && terceiroNumero >= quartoNumero && terceiroNumero >= quintoNumero) {
            System.out.println(terceiroNumero);
            
        } else if (primeiroNumero <= quartoNumero && segundoNumero <= quartoNumero
                && terceiroNumero <= quartoNumero && quartoNumero >= quintoNumero) {
            System.out.println(quartoNumero);
            
        } else if (primeiroNumero <= quintoNumero && segundoNumero <= quintoNumero
                && terceiroNumero <= quintoNumero && quartoNumero <= quintoNumero) {
            System.out.println(quintoNumero);
        }
    }
}