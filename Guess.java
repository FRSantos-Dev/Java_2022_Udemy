public class Guess {
    public static void main(String[] args)
        throws java.io.IOException{
            char ch, resposta ='K';

            System.out.println("Estou pensando em uma letra entre A e Z.");
            System.out.println("Consegue advinhar?: ");

            ch = (char) System.in.read(); // obtém um char

        if(ch == resposta) System.out.println("**Certo**");
        else System.out.println("...Sorry, you're wrong.");
    }
}