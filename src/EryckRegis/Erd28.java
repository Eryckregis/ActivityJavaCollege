package EryckRegis;

import java.util.Scanner;

public class Erd28 {
    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd28 - Soma dos pares entre 1 e 100 ");
        System.out.println("**************************");

        int i = 1;
        int sum= 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                sum+= i;
            }
            i++;
        }

        System.out.println("The sum of even numbers between 1 and 100 is: " + sum);

    }
}

