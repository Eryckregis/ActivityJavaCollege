package EryckRegis;

import javax.swing.*;
import java.util.Scanner;

public class Erd01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Aluno: Eryck regis da Silva - RA 0024513");
        System.out.println("Classe Erd01 - Exercício 1: Número positivo ou negativo ");
        System.out.println("**************************");


        System.out.println("enter a number:");
        int number = sc.nextInt();

        if(number > 0) {
            System.out.println("positive number");
        }
        else if (number < 0) {
            System.out.println("negative number");
        }
        else{
                System.out.println("number zero");
            }
        sc.close();
        }
    }

