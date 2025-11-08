package EryckRegis;

import java.util.Scanner;

public class Erd09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd09 - Ordem crescente (três números) ");
        System.out.println("**************************");


        System.out.println("enter three numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int majornumber, minornumber, intermediatenumber;

        if (number1 <= number2 && number1 <= number3) {
            minornumber = number1;
            if (number2 <= number3) {
                intermediatenumber = number2;
                majornumber = number3;
            } else {
                intermediatenumber = number3;
                majornumber = number2;
            }
        } else if (number2 <= number1 && number2 <= number3) {
            minornumber = number2;
            if (number1 <= number3) {
                intermediatenumber = number1;
                majornumber = number3;
            } else {
                intermediatenumber = number3;
                majornumber = number1;
            }
        } else {
            minornumber = number3;
            if (number1 <= number2) {
                intermediatenumber = number1;
                majornumber = number2;
            } else {
                intermediatenumber = number2;
                majornumber = number1;
            }
        }

        System.out.println("Ascending order: " + minornumber + ", " + intermediatenumber + ", " + majornumber);

        sc.close();
    }
}
