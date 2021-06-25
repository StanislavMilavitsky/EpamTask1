package by.milavitsky.homework.task1.utils;

import by.milavitsky.homework.task1.exception.IncorrectValueException;
import static by.milavitsky.homework.task1.validation.Validator.*;

public class TimeUtils {
    private static final int SECONDS_PER_DAY = 86_400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;

    public static int[] time(int secondsAll) {
        try {
            if (!isValuePositive(secondsAll)) {
                throw new IncorrectValueException("Wrong time");
            }
            int day = 0;
            int hours = 0;
            int minute = 0;
            int seconds = 0;
            while (secondsAll > SECONDS_PER_DAY) {
                secondsAll = secondsAll - SECONDS_PER_DAY;
                day++;
            }
            if (secondsAll > SECONDS_PER_HOUR) {
                hours = secondsAll / SECONDS_PER_HOUR;
            }
            secondsAll = secondsAll - hours * SECONDS_PER_HOUR;
            if (secondsAll > SECONDS_PER_MINUTE) {
                minute = secondsAll / SECONDS_PER_MINUTE;
            }
            if (secondsAll > SECONDS_PER_MINUTE) {
                seconds = secondsAll - minute * SECONDS_PER_MINUTE;
            }
            return new int[]{day, hours, minute, seconds};
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
