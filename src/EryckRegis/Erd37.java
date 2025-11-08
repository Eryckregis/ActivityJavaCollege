package EryckRegis;

import java.util.Scanner;

public class Erd37 {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd37 - Soma até o número ser múltiplo de 10 ");
        System.out.println("**************************");

        int number;
        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            sum += number;
        } while (number % 10 != 0);

        System.out.println("The total sum is: " + sum);
        System.out.println("program terminated because " + number + " is a multiple of 10");

        sc.close();
    }
}

