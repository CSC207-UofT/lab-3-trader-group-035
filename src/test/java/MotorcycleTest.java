/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class MotorcycleTest {
    Motorcycle h;

    @Before
    public void setUp() throws Exception {
        h = new Motorcycle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, h.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(98, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, h.getPrice());
    }

}