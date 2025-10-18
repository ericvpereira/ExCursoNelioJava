package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta(0, null);

        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String titular = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);

        if (resp == 'y' || resp == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(conta.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double quantia = sc.nextDouble();
        conta.depositar(quantia);
        System.out.println("Update account data:");
        System.out.println(conta.toString());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        quantia = sc.nextDouble();
        conta.sacar(quantia);
        System.out.println("Update account data: ");
        System.out.println(conta.toString());
        
        sc.close();
    }
}
