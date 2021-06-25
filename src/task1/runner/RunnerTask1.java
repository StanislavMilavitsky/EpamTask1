package by.milavitsky.homework.task1.runner;

import static by.milavitsky.homework.task1.utils.MathUtils.lastDigit;

public class RunnerTask1 {
    public static int runTask1(double value) {
        double result;
            result = Math.pow(lastDigit(value), 2);
            result = lastDigit(result);
        return (int) result;
    }
}
