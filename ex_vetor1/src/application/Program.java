package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] numeros = new int[n];
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] < 0) {
                System.out.println("NUMEROS NEGATIVOS: ");
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}
