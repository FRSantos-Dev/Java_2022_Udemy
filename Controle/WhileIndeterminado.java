package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("sair")){ //Enquanto não for digitado a palavra
            // SAIR continue executando infinitamente
            System.out.println("Voc~E diz: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}
