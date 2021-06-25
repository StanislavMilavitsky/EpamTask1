package by.milavitsky.homework.task1.runner;

import static by.milavitsky.homework.task1.view.Message.*;
import static by.milavitsky.homework.task1.validation.Validator.isNull;
import static by.milavitsky.homework.task1.validation.Validator.isValuePositive;

public class RunnerTask10 {
    public static void runTask10(int a, int b, int h) {
            if (a != 0 || !isValuePositive(b) || !isValuePositive(h) || isNull(b) || isNull(h)) {
              showMessage("Incorrect values ");
              return;
            }
            int flag = 0;
            double F;
            System.out.println("|    x " + "      |         F");
            for (int x = 0; x <= b; x = a + flag * h) {
                flag++;
                System.out.println("------------------------------------------");
                F = Math.tan(x);

                System.out.println("|    " + x + "       |        " + F);
            }
    }
}
