package Controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    System.out.println("Digte a nota:  ");
    double nota = entrada.nextDouble();

    if (nota > 10 || nota < 0) { //Eliminandoas possiblidades de erros.
        System.out.println("Nota inválida! ");
    }else {
        System.out.println("Nota válida! ");
    }


        entrada.close();
    }
}
