package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTask6Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask6Positive() {
        String actual = RunnerTask6.runTask6(5555);
        String expected = "Day 0 hours 1 minutes 32 seconds 35";
        assertEquals(expected, actual);
    }

    @Test
    public void testRunTask6Negative() {
        String actual = RunnerTask6.runTask6(5555);
        String expected = "Day 0 hours 1 minutes 35 seconds 35";
        assertNotEquals(expected, actual);
    }
}