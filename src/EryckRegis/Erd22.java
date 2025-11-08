package EryckRegis;

import java.util.Scanner;

public class Erd22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd22 - Soma de números até digitar zero ");
        System.out.println("**************************");
        int number;
        int sum = 0;

        System.out.println("Enter numbers to add (0 ends):");

        while (true) {
            number = sc.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The sum of the numbers entered is: " + sum);

        sc.close();
    }
}

