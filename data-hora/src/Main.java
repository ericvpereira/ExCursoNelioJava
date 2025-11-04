import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate zeroUm = LocalDate.now();
        System.out.println("d01 = " + zeroUm);

        LocalDateTime zeroDois = LocalDateTime.now();
        System.out.println("d02 = " + zeroDois);

        Instant zeroTres = Instant.now();
        System.out.println("d03 = " + zeroTres);

        LocalDate zeroQuatro = LocalDate.parse("2022-07-20");
        System.out.println("d04 = " + zeroQuatro);

        LocalTime zeroCinco = LocalTime.parse("01:30:26");
        System.out.println("d05 = " + zeroCinco);

        Instant zeroSeis = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("d06 = " + zeroSeis);

        Instant zeroSete = Instant.parse("2022-07-20T01:30:26-03:00");
        System.out.println("d07 = " + zeroSete);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate zeroOito = LocalDate.parse("20/07/2022", fmt1);
        System.out.println("d08 = " + zeroOito);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        LocalDateTime zeroNove = LocalDateTime.parse("20 07 2022 01:30", fmt2);
        System.out.println("d09 = " + zeroNove);

        LocalDate dez = LocalDate.of(2022, 7, 20);
        System.out.println("dez = " + dez);

        LocalDateTime onze = LocalDateTime.of(2022, 7, 20, 1, 30);
        System.out.println("onze = " + onze);
    }
}
