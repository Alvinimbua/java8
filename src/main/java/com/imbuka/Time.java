package com.imbuka;

import java.time.*;

public class Time {

    public static void main(String[] args) {

        //shows date and time
        System.out.println(LocalDateTime.now());
        //shows date only
        System.out.println(LocalDate.now());
        //shows time only
        System.out.println(LocalTime.now());
        //shows both date, time and zone
        System.out.println(ZonedDateTime.now());

        System.out.println("------------------------------");

        //both pass in year, date and month
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date1);

        var date2 = LocalDate.of(2022, 1, 20);
        System.out.println(date2);

        System.out.println("------------------------------");
        var time1 = LocalTime.of(9, 56);
        System.out.println(time1);

        var time2 = LocalTime.of(9, 56, 45);
        System.out.println(time2);

        var time3 = LocalTime.of(9, 56, 59, 12);
        System.out.println(time3);

        System.out.println("------------------------------");
        //combine both date and time
        var dateTime1 = LocalDateTime.of(2022, Month.MARCH, 24, 1, 6, 30);
        System.out.println(dateTime1);

        var dateTime2 = LocalDateTime.of(date1, time2);
        System.out.println(dateTime2);

        System.out.println("------------------------------");
        //creating a zoned date time
        var zone = ZoneId.of("Africa/Kigali");
        var zone1 = ZonedDateTime.of(dateTime1, zone);
        System.out.println(zone1);

        System.out.println("------------------------------");
        //manipulating dates
        var date = LocalDate.of(2024, Month.AUGUST, 25);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(3);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        //Periods (using while)
        //var start = LocalDate.of(2024, Month.JANUARY, 1);
       // var end = LocalDate.of(2024, Month.MARCH, 30);
        //perform(start, end);

        //using periods ( for a day or ore of time)
        //output begins with P
        var start = LocalDate.of(2024, Month.JANUARY, 1);
        var end = LocalDate.of(2024, Month.MARCH, 30);
        var period = Period.ofMonths(1);
        perform(start, end, period);

        /*
        Duration -> intended for smaller units of time( hours , minutes, seconds and nanoseconds)
        used with objects that have time
        -> output begins with PT
         */

    }

    private static void perform(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while(upTo.isBefore(end)) {
            System.out.println("give new marks: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
