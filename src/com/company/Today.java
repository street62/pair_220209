package com.company;

import java.time.LocalDateTime;
import java.time.*;

public class Today {
    String year;
    String month;
    String day;
    String hour;
    String min;
    String sec;

    public Today() {
        this.year = String.valueOf(LocalDateTime.now().getYear());
        this.month = String.valueOf(LocalDateTime.now().getMonth());
        this.day = String.valueOf(LocalDateTime.now().getDayOfMonth());
        this.hour = String.valueOf(LocalDateTime.now().getHour());
        this.min = String.valueOf(LocalDateTime.now().getMinute());
        this.sec = String.valueOf(LocalDateTime.now().getSecond());
    }

    @Override
    public String toString() {
        return year + month + day + hour + min + sec;
    }
}
