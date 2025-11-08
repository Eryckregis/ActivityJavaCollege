package EryckRegis;

import java.util.Scanner;

public class Erd40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd40 - Ler números e mostrar o maior (até digitar negativo)");
        System.out.println("**************************");

        int number;
        int greater = 0;

        do {
            System.out.print("Enter a number (negative to exit): ");
            number = sc.nextInt();

            if (number >= 0 && number > greater) {
                greater = number;
            }

        } while (number >= 0);

        System.out.println("The greater number entered was: " + greater);

        sc.close();
    }
}

