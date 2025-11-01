package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int mat[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int countLinha = 0;
        int countColuna = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    countLinha = i;
                    countColuna = j;
                    System.out.print("Position " + countLinha + "," + countColuna + ":\n");

                    //Esquerda
                    if (j - 1 >= 0) {
                        System.out.print("Left " + mat[i][j - 1]);
                    }

                    //Direita
                    if (j + 1 < n) {
                        System.out.print("Right: " + mat[i][j + 1]);
                    }

                    //Acima
                    if (i - 1 >= 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }

                    //Abaixo
                    if (i + 1 < m) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

    }
}
