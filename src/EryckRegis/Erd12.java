package EryckRegis;

import java.util.Scanner;

public class Erd12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd12 - Tabuada de um número ");
        System.out.println("**************************");

        System.out.print(" Enter a number:");
        int number = sc.nextInt();

        System.out.println("Multiplication table" + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}