package src.Fundamentos;

import java.util.Scanner;

public class NextDoubleExemplo1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade;
        double balanço;

        //insira a quantidade pelo console
        System.out.println("Digite a quantidade: ");
        quantidade = entrada.nextInt();
        System.out.println("Digite o total do balanço: ");
        balanço = entrada.nextDouble();
        //reduzir a quantidade + taxa do balanço.
        balanço = balanço - (quantidade + 0.50);
        //Imprima um novo balanço.
        System.out.println("O balanço restant é : " + balanço);
        entrada.close();
    }
}
