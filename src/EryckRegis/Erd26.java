package EryckRegis;

import java.util.Scanner;

public class Erd26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd26 - Número cousin com while ");
        System.out.println("**************************");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " No, cousin!");
        } else {
            int i = 2;
            boolean cousin = true;

            while (i <= number / 2) {
                if (number % i == 0) {
                    cousin = false;
                    break;
                }
                i++;
            }

            if (cousin) {
                System.out.println(number + " It's first!");
            } else {
                System.out.println(number + " He's not my cousin!");
            }
        }

        sc.close();
    }
}
