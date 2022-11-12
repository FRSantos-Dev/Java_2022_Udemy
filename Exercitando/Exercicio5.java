package Exercitando;

import java.util.Scanner;

/*
Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
 */
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = entrada.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("Área é igual a : " + area);

        entrada.close();

    }
}
