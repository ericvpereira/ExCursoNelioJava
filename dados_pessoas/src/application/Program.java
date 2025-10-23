package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa (M/F): ", i + 1);
            genero[i] = sc.next().charAt(0);

            if (genero[i] == 'F' || genero[i] == 'f') {
                somaAlturaMulheres += altura[i];
                contMulheres++;
            } else if (genero[i] == 'M' || genero[i] == 'm') {
                contHomens++;
            }
        }

        // encontra menor e maior altura
        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        for (int i = 1; i < n; i++) {
            if (altura[i] < menorAltura) menorAltura = altura[i];
            if (altura[i] > maiorAltura) maiorAltura = altura[i];
        }

        double mediaAlturaMulheres = 0.0;
        if (contMulheres > 0) {
            mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
        }

        System.out.printf("%nMenor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d%n", contHomens);

        sc.close();
    }
}
