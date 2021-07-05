package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class RunnerTask9Test {
    double circleArea;
    double circumference;

    @Before
    public void setUp() throws Exception {
        HashMap<String, Double> map = new HashMap<>();
        map = RunnerTask9.runTask9(5);
        circleArea = map.get("Area of circle");
        circumference = map.get("Circumference");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask9PositiveCircleArea() {
        double actual = circleArea;
        double expected = 78.54;
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testRunTask9NegativeCircle() {
        double actual = circleArea;
        double expected = 79.54;
        double delta = 0.0001;
        assertNotEquals(expected, actual, delta);
    }

    @Test
    public void testRunTask9PositiveCircumference() {
        double actual = circumference;
        double expected = 31.416;
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testRunTask9PNegativeCircumference() {
        double actual = circumference;
        double expected = 32.416;
        double delta = 0.0001;
        assertNotEquals(expected, actual, delta);
    }
}