package EryckRegis;

import java.util.Scanner;

public class Erd08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd08 - Exercício 8: Login simples ");
        System.out.println("**************************");

        String email = "eryckEngenheiroDeSoftware";
        String pass = "Eryck123456";

        System.out.println("enter your email address");
        sc.nextLine();

        System.out.println("enter your password ");
        sc.nextLine();

        if (email != "eryckEngenheiroDeSoftware") {
            System.out.println("Incorrect email address, please re-enter");
        }
        if (pass != "Eryck123456") {
            System.out.println("incorrect password, please re-enter");
        }
        else System.out.println("Login successful!");

    }
}
