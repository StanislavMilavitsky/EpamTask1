package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTask7Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void teatRunTask7Positive() {
        String actual = RunnerTask7.runTask7(1,1,2,2);
        String expected = "Point B with coordinates x= 2 y= 2 closer to zero, distance = 2,828";
        assertEquals(expected, actual);
    }

    @Test
    public void teatRunTask7Negative() {
        String actual = RunnerTask7.runTask7(1,1,2,2);
        String expected = "Point B with coordinates x= 2 y= 2 closer to zero, distance = 2,829";
        assertNotEquals(expected, actual);
    }
}