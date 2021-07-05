package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTask4Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask4Positive() {
        boolean condition  = RunnerTask4.runTask4(1,2,3,4);
        assertTrue(condition);
    }

    @Test
    public void testRunTask4Negative() {
        boolean condition  = RunnerTask4.runTask4(1,2,3,5);
        assertFalse(condition);
    }
}