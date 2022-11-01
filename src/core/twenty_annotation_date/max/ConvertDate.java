package core.twenty_annotation_date.max;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
/* Створити методи які дозволять конвертувати дату з
Date --> LocalDate.
Date --> LocalTime,
Date --> LocalDateTime */
public class ConvertDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Old Date format is:\n" + date);
        System.out.println("\nNew LocalDate format is:\n" + convertToLocalDate(date));
        System.out.println("\nNew LocalTime format is:\n" + convertToLocalTime(date));
        System.out.println("\nNew LocalDateTime format is:\n" + convertToLocalDateTime(date));
    }

    public static LocalDate convertToLocalDate(Date dateConvert) {
        return dateConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime convertToLocalTime(Date dateConvert) {
        return dateConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime convertToLocalDateTime(Date dateConvert) {
        return dateConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
