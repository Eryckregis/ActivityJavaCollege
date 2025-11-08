package EryckRegis;

import java.util.Scanner;

public class Erd27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd27 - Quantidade de números ímpares digitados ");
        System.out.println("**************************");

        int number;
        int oddNumberCounter = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the " + i + " number: ");
            number = sc.nextInt();

            if (number % 2 != 0) {
                oddNumberCounter++;
            }
        }

        System.out.println("You entered " + oddNumberCounter + " odd numbers");

        sc.close();
    }
}
