package enum_practices;

import java.time.Month;

public class TestCustomEnums {
    public static <Months> void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);

        Days[]days = Days.values();

        for (Days d : days) {
            System.out.println(d);

        }
        System.out.println(Month.JANUARY);



        for (Month m : Month.values()) {
            System.out.println(m);

        }

    }
}
