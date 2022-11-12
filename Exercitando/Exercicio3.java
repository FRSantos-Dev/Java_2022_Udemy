package Exercitando;

import java.util.Scanner;

/*
Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
 */
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua altura?  ");
        String altura = entrada.next();
        double a = Double.parseDouble(altura);

        System.out.println("Qual o seu peso? ");
        String peso = entrada.next();
        double p = Double.parseDouble(peso);

        double IMC = p / (a * a);

        System.out.println(" Seu IMC é: " + IMC);

        entrada.close();

    }
}
