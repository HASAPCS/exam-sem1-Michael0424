package com.example;

public class APCalendar {
    // Helper method provided
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    // Method to implement (a)
    public static int numberOfLeapYears(int year1, int year2) {
        int leapYear = 0;

        for (int year = year1; year <= year2; year++) {
            if (isLeapYear(year)) {
                leapYear++;
            }
        }
        return leapYear;
    }

    // Your implementation here

    // Helper method provided
    private static int firstDayOfYear(int year) {
        int totalDays = 0;

        for (int i = 1; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        // Assuming Monday is 1, Tuesday is 2, ..., Sunday is 7
        return (totalDays + 1) % 7;
    }

    // Helper method provided
    private static int dayOfYear(int month, int day, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Adjust for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int dayCount = day;
        for (int i = 0; i < month - 1; i++) {
            dayCount += daysInMonth[i];
        }

        return dayCount;
    }

    // Method to implement (b)
    public static int dayOfWeek(int month, int day, int year) {
        
        int howManyDaysHavePassedInYearTillNow = dayOfYear(month, day, year);
        return (firstDayOfYear(year) + howManyDaysHavePassedInYearTillNow -1) % 7;//which day
        // how many days divide 7 = which day
        // Get the fist day
        // 1+7-1%7
        // need to do -1
        // check the day of the wrrk
        // divide by seven
        // Your implementation here
    }

}
