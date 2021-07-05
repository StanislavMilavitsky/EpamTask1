package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class RunnerTask5Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRunTask5Positive() {
        boolean condition = RunnerTask5.runTask5(6);
        assertTrue(condition);
    }

    @Test
    public void testRunTask5Negative() {
        boolean condotion = RunnerTask5.runTask5(5);
        assertFalse(condotion);
    }
}