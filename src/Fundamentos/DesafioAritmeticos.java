package Fundamentos;
/* Exemplo
      int a = 3 * 4 - 10;
      int b = (int)Math.pow(a,3); --> Usa para realizar a potenciação de a.
      double c = Math.pow(a,3);
      System.out.println(b);
      System.out.println(c);
       */
public class DesafioAritmeticos {
    public static void main(String[] args) {

        int a = 3 + 2;
        double numA =(6 * a);
        System.out.println(numA);

        double superiorA = Math.pow(numA,2);
        System.out.println(superiorA);

        int denA = 3 * 2;
        System.out.println(denA);

        System.out.println(superiorA / denA);

        int b = (1-5);
        double B = (2 - 7);

        double numB = (b * B);
        System.out.println(numB);

        int denB = 2;
        double bDiv = numB / denB;
        System.out.println(bDiv);

        double superiorB = Math.pow(bDiv, 2);
        System.out.println(superiorB); // Até aqui o código funcionou corretamente

        double chaveAB = (superiorA) - (superiorB); // Aqui em diante esta o erro
        System.out.println(chaveAB);

        double inferior = Math.pow(10, 3);
        System.out.println(inferior);
        double poten = Math.pow(chaveAB,3);
        System.out.println(poten);

        double superior = poten / inferior;
        System.out.println(superior);
    }
}
