package Fundamentos;

import org.w3c.dom.ls.LSOutput;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase() .startsWith("boa"));
        System.out.println(s.toUpperCase() .endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase() .equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.98f;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade + "\nSalario: " + salario);

        System.out.printf("Nome: %s %s", nome);

    }
}
