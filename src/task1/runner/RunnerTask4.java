package by.milavitsky.homework.task1.runner;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.validation.Validator.isNull;
import static by.milavitsky.homework.task1.validation.Validator.isValueEven;

public class RunnerTask4 {
    private static final int TWO = 2;

    public static boolean runTask4(int one, int two, int three, int four){
            if (isNull(one) || isNull(two) || isNull(three) || isNull(four)) {
                showMessage("Can`t be null");
                return false;
            }
            int flag = 0;
            if (isValueEven(one)) {
                flag++;
            }
            if (isValueEven(two)) {
                flag++;
            }
            if (isValueEven(three)) {
                flag++;
            }
            if (isValueEven(four)) {
                flag++;
            }
            return flag >= TWO;
    }
}
