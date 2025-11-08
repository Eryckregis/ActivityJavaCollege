package EryckRegis;

import java.util.Scanner;

public class Erd10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd10  - Leap year ");
        System.out.println("**************************");

        System.out.print("Enter a year:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " It's a leap year!");
        } else {
            System.out.println(year + " it is not a leap year.");
        }

        sc.close();
    }
}
