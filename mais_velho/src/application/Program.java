package application;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        int maisVelho = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (idades[j] > maisVelho) {
                maisVelho = idades[j];
                count++;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[count]);

    }
}
