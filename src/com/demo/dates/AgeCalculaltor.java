package com.demo.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalculaltor {
    String birthDate;

    public AgeCalculaltor(String birthDate) {
        this.birthDate = birthDate;
    }

    public String calculateAge(){
        LocalDate today = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(this.birthDate, df);
        long years = ChronoUnit.YEARS.between(parsedDate, today);
        long months = ChronoUnit.MONTHS.between(parsedDate, today) % 12;
        long days = ChronoUnit.DAYS.between(parsedDate, today) % 30;
        return "You are "+years+" years, " + months +" months and "+ days +" days old.";
    }
}
