package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);
            if (op == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, fee));

            } else if (op == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                products.add(new Product(name, price));

            } else if (op == 'u') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateStr = sc.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateStr, formatter);
                products.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
