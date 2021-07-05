package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class RunnerTask3Test {
    double areaRatio;
    double areaInscribedSquare;


    @Before
    public void setUp() throws Exception {
        HashMap<String, Double> map = new HashMap<String, Double>();
        map = RunnerTask3.runTask3(5);
        areaRatio = map.get("Area ratio");
        areaInscribedSquare = map.get("Area inscribed square");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask3PositiveAreaRatio() {
        double actual = areaRatio;
        double expected = 0.32;
        double delta = 0.0001;
        assertEquals(expected, actual, delta);

    }

    @Test
    public void testRunTask3NegativeAreaRatio() {
        double actual = areaRatio;
        double expected = 0.35;
        double delta = 0.0001;
        assertNotEquals(expected, actual, delta );
    }

    @Test
    public void testRunTask3PositiveAreaInscribedSquare() {
        double actual = areaInscribedSquare;
        double expected = 25;
        double delta = 0.0001;
        assertEquals(expected, actual, delta);

    }

    @Test
    public void testRunTask3NegativeareAInscribedSquare() {
        double actual = areaInscribedSquare;
        double expected = 24;
        double delta = 0.0001;
        assertNotEquals(expected, actual, delta);
    }

}