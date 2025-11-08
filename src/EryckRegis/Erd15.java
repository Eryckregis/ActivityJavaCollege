package EryckRegis;

import java.util.Scanner;

public class Erd15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd15 - Fatorial de um número");
        System.out.println("**************************");


        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);

        sc.close();
    }
}
