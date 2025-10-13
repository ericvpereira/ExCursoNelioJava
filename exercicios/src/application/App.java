package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle widht and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        System.out.println("AREA = " + String.format("%.2f", rect.area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rect.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rect.diagonal()));
    }
}
