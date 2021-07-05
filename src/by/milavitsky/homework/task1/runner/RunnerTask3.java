package by.milavitsky.homework.task1.runner;


import java.text.DecimalFormat;
import java.util.HashMap;
import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.utils.MathUtils.squareAreaCalculationIn;
import static by.milavitsky.homework.task1.utils.MathUtils.squareAreaCalculationOut;
import static by.milavitsky.homework.task1.validation.Validator.isValuePositive;

public class RunnerTask3 {
    public static HashMap runTask3(int sideOfSquare) {
            if (!isValuePositive(sideOfSquare)) {
               showMessage("Side must be positive");
               return null;
            }
            int areaCircumscribedSquare = squareAreaCalculationOut(sideOfSquare);
            int radius = sideOfSquare / 2;
            double areaInscribedSquare = squareAreaCalculationIn(radius);
            double areaRatio = (double) areaInscribedSquare / areaCircumscribedSquare;
            DecimalFormat decimalFormat = new DecimalFormat("#.###");
            areaInscribedSquare = Double.parseDouble((decimalFormat.format(areaCircumscribedSquare)).replaceAll("," , "."));
            areaRatio = Double.parseDouble((decimalFormat.format(areaRatio)).replaceAll("," , "."));
            HashMap<String, Double> resultOfTask3 = new HashMap<String, Double>();
            resultOfTask3.put("Area inscribed square", areaInscribedSquare );
            resultOfTask3.put("Area ratio", areaRatio );
            return resultOfTask3;
    }
}
