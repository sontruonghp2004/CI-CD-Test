package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class DateTimeChecker {


    public int daysInMonth(int month, int year) {


        Set<Integer> thirtyOneDays = new HashSet<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        Set<Integer> thirtyDays = new HashSet<>(Arrays.asList(4, 6, 9, 11));


        if (thirtyOneDays.contains(month)) {
            return 31;
        } else if (thirtyDays.contains(month)) {
            return 30;
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }


    public boolean isValidDate (int day, int month, int year){
        if(day < 1 || month < 1 || month > 12 || year < 1){
            return false;
        }
        return day <= daysInMonth(month, year);
    }
}