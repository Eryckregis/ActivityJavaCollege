package EryckRegis;

import java.util.Scanner;

public class Erd20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd20 - Números de Fibonacci (n termos) ");
        System.out.println("**************************");


        System.out.print("How many terms of the Fibonacci sequence do you want to see? ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci sequence with " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
