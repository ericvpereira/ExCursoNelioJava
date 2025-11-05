import java.time.*;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.of(2022, 9, 20);
        LocalDateTime d05 = LocalDateTime.of(2022, 9, 20, 1, 30);

        int dia = d04.getDayOfMonth();
        Month mes = d04.getMonth();
        int ano = d04.getYear();

        int hora = d05.getHour();
        int minuto = d05.getMinute();

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);

        Instant d06 = Instant.now();
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R2 = " + r2);

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("R1 = " + r1);

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}