import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data (yyyy-MM-dd): ");
        String entrada = scanner.nextLine();

        try {
            // Tenta converter a String em LocalDate
            LocalDate data = LocalDate.parse(entrada);

            // Formata para exibir no formato brasileiro
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Data válida: " + data.format(formatador));

        } catch (DateTimeParseException e) {
            // Caso o parse falhe, exibe uma mensagem amigável
            System.out.println("Data inválida! Verifique o formato e os valores digitados.");
        }

        scanner.close();
    }
}
