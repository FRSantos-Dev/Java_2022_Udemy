package Exercitando;

import java.util.Scanner;

/*
Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
 */
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");

        double valor = entrada.nextDouble();

        double quadrado = valor * valor;
        double cubo = valor * valor * valor;

        System.out.println("O valor ao quadrado é: " + quadrado);
        System.out.println("O valor ao cubo é: " + cubo);

        entrada.close();

    }
}
