package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numero1 = new int[5];
        int[] numero2 = new int[5];
        System.out.println(" Dame cinco números para crear un array con ellos...");

        for (int i = 0; i < numero1.length; i++) {
            System.out.print(" Numero " + (i + 1) + ": ");
            numero1[i] = entrada.nextInt();
        }

        for (int i = 0; i < numero1.length; i++) {
            numero2[4 - i] = -1 * numero1[i];
        }

        System.out.println();
        System.out.println(" Array 1: ");
        for (int i = 0; i < numero1.length; i++) {
            System.out.print(numero1[i] + " ");
        }

        System.out.println();
        System.out.println(" Array 2: ");
        for (int i = 0; i < numero2.length; i++) {
            System.out.print(numero2[i] + " ");
        }

        entrada.close();
    }
}
