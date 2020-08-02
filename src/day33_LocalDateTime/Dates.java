package day33_LocalDateTime;
import java.time.LocalDate;
public class Dates {
    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(2020,7,24);
        System.out.println(DOB);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.isLeapYear());
    }
}
