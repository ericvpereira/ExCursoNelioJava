package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }
        double media = soma / n;
        System.out.println("\nAltura media: " + String.format("%.2f", media));
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                count++;
            } else {
                continue;
            }
        }
        double percent = (double) count / n * 100.0;
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percent) + "%");
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
    
}
