import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2020-04-20");
        LocalDateTime d05 = LocalDateTime.parse("2020-04-20T10:02:30");
        Instant d06 = Instant.parse("2020-04-20T10:02:30");

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);
        LocalDate plusSevenYears = d04.plusYears(7);

        System.out.println("Past week: " + pastWeek);
        System.out.println("Next week: " + nextWeek);
        System.out.println("Plus seven years: " + plusSevenYears);

        LocalDateTime pastWeekLDT = d05.minusWeeks(1);
        LocalDateTime nextWeekLDT = d05.plusDays(7);
        System.out.println("Past LocalDateTime: " + pastWeekLDT);
        System.out.println("Next LocalDateTime: " + nextWeekLDT);

        Instant testInstant = d06;
        Instant pastInstant = testInstant.minus(7, ChronoUnit.DAYS);
        Instant nextInstant = testInstant.plus(7, ChronoUnit.DAYS);
        System.out.println("Past Instant: " + pastInstant);
        System.out.println("Next Instant: " + nextInstant);

        Duration t1 = Duration.between(pastWeekLDT, d05);
        System.out.println("T1 em dias: " + t1.toDays());

        Duration t2 = Duration.between(d04.atTime(0, 0), pastWeek.atTime(0, 0));
        // Alternativamente
        Duration t1Alt = Duration.between(d04.atStartOfDay(), d04.atStartOfDay());
        System.out.println("T1 em dias: " + t1.toDays());
    }
}