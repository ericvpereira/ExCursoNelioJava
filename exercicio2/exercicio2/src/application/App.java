package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.name = "Joao Silva";
        emp.grossSalary = 6000.00;
        emp.tax = 1000.00;

        System.out.println("Employee: " + emp.name + ", $ " + String.format("%.2f", emp.netSalary()));

        System.out.print("Which percentage to increase salary? ");;
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Update data: " + emp.name + ", $ " + String.format("%.2f", emp.netSalary()));
    }
}
