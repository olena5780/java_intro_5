package date_time;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {

        int age = ScannerHelper.getAnAge();

        System.out.println(LocalDate.now().getYear() - age);

        System.out.println(LocalDate.now().minusYears(age).getYear());

        System.out.println(LocalDate.now().minus(age, ChronoUnit.YEARS).getYear());

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year of birth");
        int year = input.nextInt();
        System.out.println(LocalDate.now().getYear() - year);


    }
}
