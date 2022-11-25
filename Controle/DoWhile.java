package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //if(...) sentenca; ou {}
        //while(...); ou {}
        //for(...; ...; ...) sentenca; ou {}

        //do{} while(...);  ÚNICA estrutura de controle que termina com;

        Scanner entrada = new Scanner(System.in);

        String texto = "por favor ";

        do{
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.println("Quer Sair? ");
            texto = entrada.nextLine();
        }while(!texto.equalsIgnoreCase("por favor"));

        entrada.close();
    }
}
