package EryckRegis;

import java.util.Scanner;

public class Erd30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd30 - Menu até escolher sair ");
        System.out.println("**************************");

        int option = 0;

        while (option != 3) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Tell me which is the best programming language");
            System.out.println("2 - Tell me which is best for programming in Java");
            System.out.println("3 - Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Java for sure");
            } else if (option == 2) {
                System.out.println("intellij idea for sure");
            } else if (option == 3) {
                System.out.println("leaving");
            } else {
                System.out.println("Invalid option, please re-enter: ");
            }
        }

        sc.close();
    }
}
