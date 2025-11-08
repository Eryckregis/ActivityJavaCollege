package EryckRegis;

public class Erd13 {
    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd13 - Soma dos 100 primeiros números naturais ");
        System.out.println("**************************");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of the first 100 natural numbers is: " + sum);
    }
}

