package EryckRegis;

import java.util.Scanner;

public class Erd04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd04 - Exercício 4: Pode votar?  ");
        System.out.println("**************************");

        System.out.println("enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you can vote ");
        } else {
            System.out.println("You are not old enough to vote");


        }
        sc.close();
    }

}
