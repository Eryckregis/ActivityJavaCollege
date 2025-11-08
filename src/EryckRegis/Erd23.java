package EryckRegis;

import java.util.Scanner;

public class Erd23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd23 - Senha correta ");
        System.out.println("**************************");


        String correctPassword = "1234";
        String password;

        System.out.print("Enter the password: ");
        password = sc.nextLine();

        while (!password.equals(correctPassword)) {
            System.out.println("Incorrect password! Please try again:");
            password = sc.nextLine();
        }
        System.out.println("Access granted!");
        sc.close();
    }
}
