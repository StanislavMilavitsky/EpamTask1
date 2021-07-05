package by.milavitsky.homework.task1.runner;

import java.text.DecimalFormat;
import java.util.HashMap;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.utils.MathUtils.circleAreaCalculation;
import static by.milavitsky.homework.task1.utils.MathUtils.circumferenceCalculation;
import static by.milavitsky.homework.task1.validation.Validator.*;

public class RunnerTask9 {
    public static HashMap runTask9(int radius) {
        if ((!isInteger(radius)) || isNull(radius) || !isValuePositive(radius)) {
            showMessage("Incorrect radius");
            return null;
        }
        HashMap<String, Double> map = new HashMap<>();
        double circleArea = circleAreaCalculation(radius);
        double circumference = circumferenceCalculation(radius);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        circleArea = Double.parseDouble((decimalFormat.format(circleArea)).replaceAll("," , "."));
        circumference = Double.parseDouble((decimalFormat.format(circumference)).replaceAll("," , "."));
        map.put("Area of circle", circleArea);
        map.put("Circumference", circumference);
        return map;
    }
}
