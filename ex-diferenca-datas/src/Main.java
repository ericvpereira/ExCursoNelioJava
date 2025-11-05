import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira data (yyyy-MM-dd): ");
        String data1 = sc.nextLine();
        LocalDate d1 = LocalDate.parse(data1);
        System.out.print("Digite a segunda data (yyyy-MM-dd): ");
        String data2 = sc.nextLine();
        LocalDate d2 = LocalDate.parse(data2);

        long diferenca = ChronoUnit.DAYS.between(d1, d2);
        System.out.print("Diferenca: " + diferenca);
        sc.close();
    }
}