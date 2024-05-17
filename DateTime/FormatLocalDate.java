package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatLocalDate {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate1 = LocalDate.now();
        String s1 = localDate1.format(dateTimeFormatter);
        System.out.println(s1);
    }
}
