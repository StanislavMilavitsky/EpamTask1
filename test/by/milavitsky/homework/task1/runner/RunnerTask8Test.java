package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTask8Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask8Positive() {
        double actual = RunnerTask8.runTask8(2);
        double expected = 0.5;
        double delta = 0.0001;
        assertEquals(expected,actual, delta);
    }

    @Test
    public void testRunTask8Negative() {
        double actual = RunnerTask8.runTask8(2);
        double expected = 0.6;
        double delta = 0.0001;
        assertNotEquals(expected,actual, delta);
    }
}