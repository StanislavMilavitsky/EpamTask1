package by.milavitsky.homework.task1.runner;

import java.text.DecimalFormat;

import static by.milavitsky.homework.task1.utils.MathUtils.distanceFromZero;

public class RunnerTask7 {
    public static String runTask7(int x1, int y1, int x2, int y2) {
        double distance1 = distanceFromZero(x1, y1);
        double distance2 = distanceFromZero(x2, y2);
        String point;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        if (distance1 < distance2) {
            point = "Point B with coordinates x= " + x2 + " y= " + y2 + " closer to zero, distance = " + decimalFormat.format(distance2);
            return point;
        } else if (distance1 > distance2) {
            point = "Point A with coordinates x" + x1 + "y " + y1 + " closer to zero, distance = " + decimalFormat.format(distance1);
            return point;
        } else {
            point = "Points A and B are equally located from 0, distance A = " + decimalFormat.format(distance2) + "distance B = " + decimalFormat.format(distance1);
            return point;
        }
    }

}
