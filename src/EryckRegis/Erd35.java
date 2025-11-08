package EryckRegis;

import java.util.Scanner;

public class Erd35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd35 - Número positivo obrigatório  ");
        System.out.println("**************************");

        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Invalid number! Please try again ");
            }

        } while (number <= 0);

        System.out.println("Accepted number: " + number);

        sc.close();
    }
}
