package Exercitando;

import java.util.Scanner;

/*
Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
Use como exemplo a = 1, b = 12 e c = -13.
Encontre o delta.
 */
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a = 1,b = 12, c= 13, delta;

        delta = (b * b) - (4 * a * c);

        System.out.println("O delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

        entrada.close();



    }
}
