package Fundamentos;

public class ConversaõTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; //Conversão implicita do INT para DOUBLE
        System.out.println(a);

        float b = (float) 1.12345; //Conversão explicita (CAST)
        System.out.println(b);
        //Java não analisa valores, apenas tipos.
        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e;
        System.out.println(f);

    }
}
