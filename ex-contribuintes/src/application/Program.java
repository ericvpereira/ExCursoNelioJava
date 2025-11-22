package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Helth expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;

        for (TaxPayer taxa : taxPayers) {
            System.out.println(taxa.getName() + ": " + "$ " + String.format("%.2f", taxa.tax()));
            sum += taxa.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f", sum);

        sc.close();
    }
}
