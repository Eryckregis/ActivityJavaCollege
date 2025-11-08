package EryckRegis;

import java.util.Scanner;

public class Erd25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd25 - Tabuada com while ");
        System.out.println("**************************");

        System.out.print("Enter a number to see the multiplication table: ");
        int number = sc.nextInt();

        int i = 1;
        System.out.println(" Multiplication table " + number + ":");

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        sc.close();
    }
}


