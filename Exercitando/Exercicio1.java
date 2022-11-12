package Exercitando;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
// C = (F-32) / 1.8
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Entrada de dados pelo teclado.

        double fator = 1.8, ajuste = 32; // Definindo Váriaveis

        System.out.println("Informe a temperatura em Fahreheint: ");
        String Fahreheint = entrada.next();//Informação que entra pelo teclado é uma String.

        double F = Double.parseDouble(Fahreheint); //Convertendo a String em Double

        double celsius = (F - 32) / 1.8;

        System.out.println("A temperatura em Celcius é: " + celsius);

        entrada.close();
    }
}
