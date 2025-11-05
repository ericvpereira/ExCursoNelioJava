import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento (yyyy-MM-dd): ");
        String dataNascimento = sc.nextLine();
        LocalDate d1 = LocalDate.parse(dataNascimento);
        Period idade = Period.between(d1, LocalDate.now());
        System.out.println("Você nasceu em: " + d1);
        System.out.println("Você tem " + idade.getYears() + " anos");
    }
}