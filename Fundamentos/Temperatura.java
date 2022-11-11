package Fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // Fórmula : (F - 32) x 5/9 = C

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahreheint = 86;
        double celsius = (fahreheint - AJUSTE) * FATOR;

        System.out.println(celsius);
    }
}
