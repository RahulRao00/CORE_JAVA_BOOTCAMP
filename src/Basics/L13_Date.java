package Basics;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class L13_Date {
        public static void main(String[] args) {


            System.out.println("🕒 MODERN DATE API (Java 8+)\n");

            // 1. Current date and time
            LocalDate today = LocalDate.now();
            LocalTime time = LocalTime.now();
            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println("LocalDate: " + today);
            System.out.println("LocalTime: " + time);
            System.out.println("LocalDateTime: " + dateTime);

            // 2. Format DateTime
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Formatted DateTime: " + dateTime.format(dtf));

            // 3. Specific date and time
            LocalDate birthday = LocalDate.of(2000, Month.DECEMBER, 25);
            System.out.println("Birthday: " + birthday);

            // 4. Add/Subtract days/months/years
            LocalDate future = today.plusDays(10);
            System.out.println("10 Days Later: " + future);

            LocalDate past = today.minusMonths(2);
            System.out.println("2 Months Ago: " + past);

            // 5. Duration between two times
            LocalTime start = LocalTime.of(10, 30);
            LocalTime end = LocalTime.of(14, 45);
            Duration duration = Duration.between(start, end);
            System.out.println("Duration: " + duration.toHours() + " hours " + duration.toMinutesPart() + " mins");

            // 6. Period between two dates
            Period age = Period.between(LocalDate.of(2000, 12, 25), today);
            System.out.println("Age is: " + age.getYears() + " Years, " + age.getMonths() + " Months, " + age.getDays() + " Days");

            // 7. Zoned date time
            ZonedDateTime zonedNow = ZonedDateTime.now();
            System.out.println("Zoned Now: " + zonedNow);

            ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
            System.out.println("IST Time: " + istTime);
        }
    }

