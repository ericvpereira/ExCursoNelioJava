package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        double soma = 0.0;
        double media = 0.0;
        int count = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 0) {
                soma += vetor[j];
                count++;
            } else {
                continue;
            }
        }
        media = soma / count;
        if (media > 0) {
            System.out.printf("%.1f", media);
        }

        if (soma == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
