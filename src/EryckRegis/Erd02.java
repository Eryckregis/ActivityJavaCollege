package EryckRegis;

import java.util.Scanner;

public class Erd02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd02 - Exercício 2: Par ou ímpar ");
        System.out.println("**************************");


        System.out.println("enter a number:");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}
