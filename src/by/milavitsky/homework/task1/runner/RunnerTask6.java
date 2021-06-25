package by.milavitsky.homework.task1.runner;

import by.milavitsky.homework.task1.utils.TimeUtils;

import java.util.HashMap;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.validation.Validator.isInteger;
import static by.milavitsky.homework.task1.validation.Validator.isValuePositive;

public class RunnerTask6 {
    public static HashMap runTask6(int time) {
        if (!isInteger(time) || !isValuePositive(time)) {
            showMessage("Incorrect value or negative");
            return null;
        }
        int[] arrayTime = TimeUtils.time(time);
        String day = String.valueOf(arrayTime[0]);
        String hours = String.valueOf(arrayTime[1]);
        String minutes = String.valueOf(arrayTime[2]);
        String seconds = String.valueOf(arrayTime[3]);
        HashMap<String, String> timeAll = new HashMap<String, String>();
        timeAll.put("Days", day);
        timeAll.put("Hours", hours);
        timeAll.put("Minutes", minutes);
        timeAll.put("Seconds", seconds);
        return timeAll;
    }
}
