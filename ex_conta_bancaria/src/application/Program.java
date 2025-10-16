package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Entre com o titular da conta: ");
        String titular = sc.nextLine();
        sc.nextLine();

        System.out.print("Haverá depósito inicial (s/n)? ");
        char resp = sc.next().charAt(0);

        if (resp == 's' || resp == 'S') {
            System.out.print("Entre com o valor de depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();

        System.out.println("Dados da conta: ");
        System.out.println(conta.toString());
        System.out.println();
        
    }
}
