package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int soma = 0;

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int j = 0; j < n; j++) {
            b[j] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int index = 0; index < n; index++) {
            soma = a[index] + b[index];
            System.out.println(soma);
        }
        sc.close();
    }
}
