import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDateTime d04 = LocalDateTime.of(2022, 7, 20, 1, 30);
        LocalDateTime d05 = LocalDateTime.of(2022, 7, 20, 10, 30);
        Instant d06 = Instant.parse("2022-07-20T01:30:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d04 = " + fmt1.format(d04));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d05 (fmt2) = " + d05.format(fmt2));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d06 (fmt3) = " + fmt3.format(d06));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("d05 (ISO_LOCAL_DATE_TIME) = " + fmt4.format(d05));

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d06 (ISO_INSTANT) = " + fmt5.format(d06));
    }
}