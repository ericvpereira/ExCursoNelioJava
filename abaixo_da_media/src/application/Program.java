package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] < media) {
                System.out.println(vetor[j]);
            }
        }
        sc.close();
    }
}
