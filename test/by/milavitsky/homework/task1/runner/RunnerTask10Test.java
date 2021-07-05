package by.milavitsky.homework.task1.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTask10Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRununTask10PositiveF() {
        String actual = RunnerTask10.runTask10(0,10,1);
        String expected = "|    x       |         F\n" +
                "---------------------------\n" +
                "|    0       |        0.0\n" +
                "---------------------------\n" +
                "|    1       |        1.56\n" +
                "---------------------------\n" +
                "|    2       |        -2.19\n" +
                "---------------------------\n" +
                "|    3       |        -0.14\n" +
                "---------------------------\n" +
                "|    4       |        1.16\n" +
                "---------------------------\n" +
                "|    5       |        -3.38\n" +
                "---------------------------\n" +
                "|    6       |        -0.29\n" +
                "---------------------------\n" +
                "|    7       |        0.87\n" +
                "---------------------------\n" +
                "|    8       |        -6.8\n" +
                "---------------------------\n" +
                "|    9       |        -0.45\n" +
                "---------------------------\n" +
                "|    10       |        0.65";
        assertEquals(expected, actual);
    }

    @Test
    public void testRununTask10NegativeF() {
        String actual = RunnerTask10.runTask10(0,10,1);
        String expected = "|    x       |         F\n" +
                "---------------------------\n" +
                "|    0       |        0.0\n" +
                "---------------------------\n" +
                "|    1       |        1.44\n" +
                "---------------------------\n" +
                "|    2       |        -2.19\n" +
                "---------------------------\n" +
                "|    3       |        -0.14\n" +
                "---------------------------\n" +
                "|    4       |        1.14\n" +
                "---------------------------\n" +
                "|    5       |        -3.38\n" +
                "---------------------------\n" +
                "|    6       |        -0.29\n" +
                "---------------------------\n" +
                "|    7       |        0.87\n" +
                "---------------------------\n" +
                "|    8       |        -6.8\n" +
                "---------------------------\n" +
                "|    9       |        -0.45\n" +
                "---------------------------\n" +
                "|    10       |        0.65";
        assertNotEquals(expected, actual);
    }
}