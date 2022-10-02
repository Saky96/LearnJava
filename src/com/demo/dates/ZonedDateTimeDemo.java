package com.demo.dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {

        ZonedDateTime defaultTime = ZonedDateTime.now(); // Shows GMT on Lex
        System.out.println("Default time and zone:\t\t" + defaultTime);

        ZonedDateTime timeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York:\t" + timeInNewYork);

        ZonedDateTime timeInLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Current time in London:\t\t" + timeInLondon);

        System.out.println();

        // Getting the time in India from corresponding time in London
        System.out.println("If the current time in London is "+timeInLondon.toLocalTime() + ", in India it is "
                + timeInLondon.withZoneSameInstant(ZoneId.of("Asia/Calcutta")).toLocalTime());

        // Getting the date in India from corresponding date in New York
        System.out.println("Current date in New York is "+timeInNewYork.toLocalDate() + ". In India it is "
                + timeInNewYork.withZoneSameInstant(ZoneId.of("Asia/Calcutta")).toLocalDate());
    }
}
