package by.milavitsky.homework.task1.runner;

import java.util.HashMap;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.utils.MathUtils.circleAreaCalculation;
import static by.milavitsky.homework.task1.utils.MathUtils.circumference;
import static by.milavitsky.homework.task1.validation.Validator.*;

public class RunnerTask9 {
    public static HashMap runTask9(int radius) {
        if ((!isInteger(radius)) || isNull(radius) || !isValuePositive(radius)) {
            showMessage("Incorrect radius");
            return null;
        }
        HashMap<String, Double> map = new HashMap<>();
        map.put("Area of circle", circleAreaCalculation(radius));
        map.put("Circumference", circumference(radius));
        return map;
    }
}
