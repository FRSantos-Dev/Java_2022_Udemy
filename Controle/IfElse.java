package Controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: ");

        int numero = Integer.parseInt(valor); // Convertendo a STRING em um número inteiro

        if (numero % 2 == 0){ // comparando numero ao realizar a divisão usando o módulo % e caso seu resto de 0.
            System.out.println("Número Par! ");
        } else {
            System.out.println("Número Ímpar! ");
        }
    }
}
