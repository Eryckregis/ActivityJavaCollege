package EryckRegis;

import java.util.Scanner;

public class Erd07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd07 - Exercício 7: Triângulo válido");
        System.out.println("**************************");


        System.out.println("Enter side A:");
        int a = sc.nextInt();

        System.out.println("Enter side B:");
        int b = sc.nextInt();

        System.out.println("Enter side C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle");
        }

        sc.close();
    }
}

