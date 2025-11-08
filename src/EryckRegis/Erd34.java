package EryckRegis;

import java.util.Scanner;

public class Erd34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd34 - Pedir senha até acertar ");
        System.out.println("**************************");

        int password;

        do {
            System.out.print("Enter the password: ");
            password = sc.nextInt();

            if (password != 1111) {
                System.out.println("Incorrect password. Please try again:");
            }

        } while (password != 1111);

        System.out.println("Access granted");

        sc.close();
    }
}

