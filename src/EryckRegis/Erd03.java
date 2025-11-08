package EryckRegis;

import java.util.Scanner;

public class Erd03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd03 - Exercício 3: Maior de dois números ");
        System.out.println("**************************");

        System.out.println("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("number " + a + " greater than " + b);
        }else{
            System.out.println("number " + a + " less than " + b);
        }
        sc.close();
    }

}
