package dateAndTimes;

import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        //Local Date
        LocalDate localDate = LocalDate.of(2016, Month.APRIL, 23);
        System.out.println(localDate);

        //Local Time
        LocalTime localTime = LocalTime.of(7, 15, 30);
        System.out.println(localTime);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(2016, Month.APRIL, 23, 7, 15, 30);
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime2);

        //Zoned Date Time
        ZoneId zone = ZoneId.of("America/Chicago");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zone);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, zone);


        //Manipulating date time objects
        LocalDate anotherLocalDate = localDate.minusDays(2);
        System.out.println(anotherLocalDate);
        LocalDateTime anotherLocalDateTime = localDateTime.minusMinutes(30);
        System.out.println(anotherLocalDateTime);

        //Period is a day or more of time
        //Duration is a day or less of time
        Period eachDay = Period.ofDays(1);
        Period monthly = Period.ofMonths(1);
        Period weekly = Period.ofWeeks(1);
        Period yearly = Period.ofYears(1);

        Duration daily = Duration.ofDays(1);
        Duration hourly = Duration.ofHours(1);
        Duration everyMinute = Duration.ofMinutes(1);
        Duration everyTenSeconds = Duration.ofSeconds(10);
        Duration everyMilli = Duration.ofMillis(1);
        Duration everyNano = Duration.ofNanos(1);

        //Duration can be added to objects with time
        LocalTime localTimeDuration = localTime.plus(everyTenSeconds);
        System.out.println(localTimeDuration);

        //Periods can be added to objects with dates
        LocalDate localDatePeriod = localDate.plus(weekly);
        System.out.println(localDatePeriod);

        //Check if a date/time object is before or after another
        System.out.println(localDate.isBefore(anotherLocalDate));
        System.out.println(localDateTime.isAfter(anotherLocalDateTime));

    }
}
