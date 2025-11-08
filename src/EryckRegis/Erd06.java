package EryckRegis;

import java.util.Scanner;

public class Erd06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd06 - Exercício 6: Múltiplo de 3 e/ou 5  ");
        System.out.println("**************************");

        System.out.println("enter a number:");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is a multiple of 3 and 5");
        }
        else if (number % 3 == 0) {
            System.out.println(number + " It is a multiple of 3 but not of 5");
        }
        else if (number % 5 == 0) {
            System.out.println(number + " It is a multiple of 5 but not of 3.");
        }
        else {
            System.out.println(number + " is not a multiple of 3 or 5");
        }
        sc.close();
    }
}

