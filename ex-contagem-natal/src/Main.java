import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        int anoAtual = data.getYear();
        LocalDate natal = LocalDate.of(anoAtual, 12, 25);
        long between = ChronoUnit.DAYS.between(data, natal);
        System.out.println("Faltam " + between + " dias para o Natal!");
    }
}