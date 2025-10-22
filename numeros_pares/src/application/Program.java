package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vet = new int[n];
        int qtd = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        for (int j = 0; j < vet.length; j++) {
            if (vet[j] % 2 == 0) {
                System.out.print(vet[j] + " ");
                qtd++;
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + qtd);

        sc.close();
    }
}
