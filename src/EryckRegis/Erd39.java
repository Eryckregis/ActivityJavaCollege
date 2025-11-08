package EryckRegis;

import java.util.Scanner;

public class Erd39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd39 - Validar número entre 1 e 5 ");
        System.out.println("**************************");

        int number;

        do {
            System.out.print("Enter a number between 1 and 5: ");
            number = sc.nextInt();

            if (number < 1 || number > 5) {
                System.out.println("Invalid value! Please try again");
            }

        } while (number < 1 || number > 5);

        System.out.println("Accepted number: " + number);

        sc.close();
    }
}
