package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate DOB = LocalDate.of(1988, Month.JANUARY, 19);
        System.out.println(today);
        System.out.println(DOB);

        System.out.println(Period.between(DOB, today).getDays()); //22
        System.out.println(Period.between(DOB, today).getMonths()); //3
        System.out.println(Period.between(DOB, today).getYears()); //34

        //Using ChronoUnit
        System.out.println(ChronoUnit.YEARS.between(DOB, today)); //34
        System.out.println(ChronoUnit.MONTHS.between(DOB, today)); //418
        System.out.println(ChronoUnit.DAYS.between(DOB, today)); //12745
        System.out.println(ChronoUnit.WEEKS.between(DOB, today)); //1820

        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2)); //1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2)); //61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2)); //3690


    }
}
