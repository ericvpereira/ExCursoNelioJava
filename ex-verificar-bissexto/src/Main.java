import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: (yyyy): ");
        int year = sc.nextInt();
        boolean bissexto = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println("O ano " + year + " é bissexto? " + bissexto);
        sc.close();
    }
}