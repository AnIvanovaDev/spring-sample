package com.nastya.study.reflection;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static final String TIME_FORMAT_OF_THREE = "Hmm";
    public static final String TIME_FORMAT_OF_FOUR ="HHmm";

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/uu");
        LocalDate date = LocalDate.parse("10/3/16", formatter);
        System.out.println(date.toString());

        LocalTime time1 =LocalTime.parse("745", DateTimeFormatter.ofPattern(TIME_FORMAT_OF_THREE));
        LocalTime time2 =LocalTime.parse("2005", DateTimeFormatter.ofPattern(TIME_FORMAT_OF_FOUR));
        System.out.println(time1.toString());
        System.out.println(time2.toString());
    }
}
