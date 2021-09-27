/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class MotorcycleTest {
    Motorcycle m;

    @Before
    public void setUp() throws Exception {
        m = new Motorcycle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        m.upgradeSpeed();
        assertEquals(102, m.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        m.downgradeSpeed();
        assertEquals(98, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, m.getPrice());
    }

}