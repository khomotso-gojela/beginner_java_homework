package chapter11.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date;
        date = LocalDateTime.now();
        System.out.println("Today date :" +date);
        System.out.println(date.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
}
