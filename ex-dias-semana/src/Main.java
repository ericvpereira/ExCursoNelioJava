import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data: ");
        String data = sc.nextLine();
        LocalDate d1 = LocalDate.parse(data);
        String diaSemana = d1.getDayOfWeek().name();
        System.out.println("Dia da semana: " + diaSemana);
    }
}