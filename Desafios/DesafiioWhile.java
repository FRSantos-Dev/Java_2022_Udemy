package Desafios;

import java.util.Scanner;

public class DesafiioWhile {
    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);

        int quantdadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != 1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                quantdadeDeNotas++;
            }
        }

        // Calcular a média
        double media = total / quantdadeDeNotas;
        System.out.println("Média = " + media);

        entrada.close();
    }
}
