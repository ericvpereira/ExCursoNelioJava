import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data: ");
        String data = sc.nextLine();
        LocalDate primeiroDia = LocalDate.parse(data);
        LocalDate dia = primeiroDia.withDayOfMonth(1);
        System.out.println("Primeiro dia do mês: " + dia);
        LocalDate ultimoDia = LocalDate.parse(data);
        int dia2 = ultimoDia.lengthOfMonth();
        System.out.println("Último dia do mês: " + dia2);
    }
}