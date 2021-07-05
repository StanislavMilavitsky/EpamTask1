package by.milavitsky.homework.task1.runner;

import java.text.DecimalFormat;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.validation.Validator.isNull;
import static by.milavitsky.homework.task1.validation.Validator.isValuePositive;

public class RunnerTask10 {
    public static String runTask10(int a, int b, int h) {
            if (a != 0 || !isValuePositive(b) || !isValuePositive(h) || isNull(b) || isNull(h)) {
              showMessage("Incorrect values ");
              return null;
            }
            String result = "|    x " + "      |         F" ;
            int flag = 0;
            double F;
            for (int x = 0; x <= b; x = a + flag * h) {
                flag++;
                result = result + "\n---------------------------";
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                F = Double.parseDouble((decimalFormat.format(Math.tan(x))).replaceAll("," , "."));
                result = result + "\n|    " + x + "       |        " + F;
            }
            return result;
    }
}
