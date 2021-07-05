package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTask2Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask2Positive() {
        int actual = RunnerTask2.runTask2(2, 2000);
        int expected = 29;
        assertEquals(expected,actual);
    }
    @Test
    public void testRunTask2Negative() {
        int actual = RunnerTask2.runTask2(2, 2000);
        int expected = 28;
        assertNotEquals(expected,actual);
    }
}