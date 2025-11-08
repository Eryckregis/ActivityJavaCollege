package EryckRegis;

import java.util.Scanner;

public class Erd33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd33 - Menu com opção de sair ");
        System.out.println("**************************");

        int option;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Message");
            System.out.println("2 - Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("You have selected the message");
            } else if (option != 2) {
                System.out.println("Invalid option! Please try again");
            }

        } while (option != 2);

        System.out.println("Leaving");
        sc.close();
    }
}

