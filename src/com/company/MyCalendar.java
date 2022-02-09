package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class MyCalendar {

    public Today getToDay() {
        Today today = new Today();
        return today;
    }

    public LocalDate getDate() {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }

    public String getKoreanDate(LocalDate date) {
        String year = String.valueOf(date.getYear());
        int month = date.getMonth().getValue();
        String day = String.valueOf(date.getDayOfMonth());

        return year + "년" + month + "월" + day + "일";
    }
}