package by.milavitsky.homework.task1.runner;

public class RunnerTask8 {
    public static double runTask8(int x) {
            double result = x >= 3 ? Math.pow(-x, 2) + 3 * x + 9 : 1 / (Math.pow(x, 3) - 6);
            return result;

    }
}
