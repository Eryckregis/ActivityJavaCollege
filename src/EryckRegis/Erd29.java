package EryckRegis;

import java.util.Scanner;

public class Erd29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd29 - Contar dígitos de um número ");
        System.out.println("**************************");

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int accountant = 0;

        while (number > 0) {
            number = number / 10;
            accountant++;
        }

        System.out.println("The number has" + accountant + "digits");

        sc.close();
    }
}
