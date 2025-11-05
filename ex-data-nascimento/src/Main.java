import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (yyyy-MM-dd): ");
        String dataTexto = sc.nextLine();
        LocalDate d1 = LocalDate.parse(dataTexto);
        System.out.println("Você nasceu em: " + d1);
    }
}