package by.milavitsky.homework.task1.utils;

import by.milavitsky.homework.task1.exception.IncorrectValueException;

import static by.milavitsky.homework.task1.validation.Validator.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

public class MathUtils {

    public static int lastDigit(double value) {
        return (int) value % 10;
    }

    public static int squareAreaCalculationOut(int sideOfSquare) {
        try {
            if (isNull(sideOfSquare) || !isValuePositive(sideOfSquare)) {
                throw new IncorrectValueException("Incorrect value of side");
            }
            return sideOfSquare * sideOfSquare;
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public static int squareAreaCalculationIn(int radius) {
        try {
            if (isNull(radius) || !isValuePositive(radius)) {
                throw new IncorrectValueException("Incorrect value");
            }
            return radius * radius * 2;
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }


    public static boolean isPerfectValue(long value) {
        if (value < 2) return false;
        long sum = 1;
        long sqrt = (long)Math.sqrt(value);
        for (long div = 2; div <= sqrt; div++) {
            if (value % div == 0) {
                sum += div + value / div;
                if (sum > value) return false;
            }
        }
        return value == sum;
    }

    public static double distanceFromZero(int x, int y)  {
            int x0 = 0;
            int y0 = 0;
            return sqrt(pow(x - x0, 2) + pow(y - y0, 2));

    }


    public static double circleAreaCalculation(int radius){
        try {
            if (isNull(radius) || !isValuePositive(radius)) {
                throw new IncorrectValueException("Must be positive");
            }
            return PI * radius * radius;
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }


    public static double circumference(int radius){
        try {
            if (isNull(radius) || !isValuePositive(radius)) {
                throw new IncorrectValueException("Must be positive");
            }
            return PI * 2 * radius;
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}