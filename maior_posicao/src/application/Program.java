package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vec = new double[n];
        double maior = 0.0;
        int pos = 0;

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Digite um numero: ");
            vec[i] = sc.nextDouble();
        }

        for (int j = 0; j < vec.length; j++) {
            if (vec[j] > maior) {
                maior = vec[j];
                pos++;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + pos);

        sc.close();
    }
}
