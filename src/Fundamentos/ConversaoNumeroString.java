package Fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000; //Wrapper
        System.out.println(num1.toString().length());

        int num2 = 100000; //Tipo primitivo
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num2).length());

    }
}
