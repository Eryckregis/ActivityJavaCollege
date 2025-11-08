package EryckRegis;

import java.util.Scanner;

public class Erd05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd05 - Exercício 5: Notas e aprovação ");
        System.out.println("**************************");


        System.out.println("enter your grade for the first two months:");
        int grade1 = sc.nextInt();
        System.out.println("enter your grade for the second quarter:");
        int grade2 = sc.nextInt();

        int average = 12;

        if(grade1 + grade2 >= average) {
            System.out.println("Congratulations, you passed the semester");
        }
        else{
                System.out.println("You failed the semester");
            }
        sc.close();
    }

}
