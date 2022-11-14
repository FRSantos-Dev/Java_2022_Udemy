package Exercitando;

import java.util.Scanner;


//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

// --> F = C * 1.8 + 32
public class Exercico2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        String Celsius = entrada.next();

        double C = Double.parseDouble(Celsius);

        double F = C * 1.8;
        System.out.println("A temperatur em Fahreheint é: " + F);

        entrada.close();
    }
}
