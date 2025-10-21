package Application;

import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] valores = new double[N];
        double soma = 0.0;
        double media = 0.0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
            soma += valores[i];
            media = soma / valores.length;
            System.out.printf("VALORES = %.1f\n", valores[i]);
        }

        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }

}
