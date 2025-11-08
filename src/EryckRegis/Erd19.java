package EryckRegis;

import java.util.Scanner;

public class Erd19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd19 - ");
        System.out.println("**************************");


        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int dividers = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividers++;
            }
        }
        if (dividers == 2) {
            System.out.println(number + " It's first!");
        } else {
            System.out.println(number + " No, cousin!");
        }

        sc.close();
    }
}



