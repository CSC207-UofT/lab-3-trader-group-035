/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CamelTest {
    Camel c;

    @Before
    public void setUp() throws Exception {
        c = new Camel();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Mrrh!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, c.getPrice());
    }

}