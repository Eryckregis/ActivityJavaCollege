package EryckRegis;

import java.util.Scanner;

public class Erd38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd38 - Confirmar saída com 's' ");
        System.out.println("**************************");

        char response;
        int option;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Enter your name");
            System.out.println("2 - Enter your age");
            System.out.print("Select an option: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("What is your name? ");
                    String name = sc.nextLine();
                    System.out.println("Hi, " + name);
                    break;
                case 2:
                    System.out.print("How old are you? ");
                    int age = sc.nextInt();
                    System.out.println("You are " + age + " years old");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.print("\nWould you like to leave? (s/n): ");
            response = sc.next().charAt(0);

        } while (response != 's' && response != 'S');

        System.out.println("Leaving");

        sc.close();
    }
}

