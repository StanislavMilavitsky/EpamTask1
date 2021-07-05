package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTask1Test {
    @Before
    public void setUp() {
    }

    @After
    void tearDown() {
    }

    @Test
    void testRunTask1Positive() {
    int actual = RunnerTask1.runTask1(158);
    int expected = 4;
    assertEquals(expected, actual);
    }
    @Test
    void testRunTask1Negative() {
        int actual = RunnerTask1.runTask1(158);
        int expected = 5;
        assertNotEquals(expected, actual);
    }
}