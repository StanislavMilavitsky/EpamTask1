package by.milavitsky.homework.task1.runner;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.utils.MathUtils.isPerfectValue;
import static by.milavitsky.homework.task1.validation.Validator.isNull;

public class RunnerTask5 {
    public static boolean runTask5(int value) {

            if (isNull(value)) {
                showMessage("Value cant be null");
                return false;
            }
             return isPerfectValue(value);
    }
}
