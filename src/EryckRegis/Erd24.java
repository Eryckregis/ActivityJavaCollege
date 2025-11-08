package EryckRegis;

import java.util.Scanner;

public class Erd24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd24 -  Verificar se um número é positivo ");
        System.out.println("**************************");

        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Number is not positive! Please try again");
            }
        } while (number <= 0);

        System.out.println("Thank you! You have entered a positive number: " + number);

        sc.close();
    }
}
