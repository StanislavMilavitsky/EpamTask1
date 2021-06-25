package by.milavitsky.homework.task1.utils;

public class DateUtils {

    public enum Month {
        JANUARY(1, 31),
        FEBRUARY(2, 28),
        MARCH(3, 31),
        APRIL(4, 30),
        MAY(5, 31),
        JUNE(6, 30),
        JULY(7, 31),
        AUGUST(8, 31),
        SEPTEMBER(9, 30),
        OCTOBER(10, 31),
        NOVEMBER(11, 30),
        DECEMBER(12, 31);

        private final int numberOfMonth;
        private final int daysInMonth;


        Month(int numberOfMonth, int daysInMonth) {
            this.numberOfMonth = numberOfMonth;
            this.daysInMonth = daysInMonth;
        }


        public static Month getMonthNoneLeap(int month) {
            for (Month value : Month.values()) {
                if (value.numberOfMonth == month) {
                    return value;
                }
            }
            throw new IllegalArgumentException("Incorrect month");
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return Month.FEBRUARY.daysInMonth + 1;
        }
        return Month.getMonthNoneLeap(month).daysInMonth;
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 || year % 400 == 0 || year % 100 == 0;

    }

}