import org.junit.*;

import static org.junit.Assert.*;

public class BikeTest {

    Bike b;

    @Before
    public void setUp() throws Exception {
        b = new Bike();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Ding!Ding!", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(20, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(23, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(18, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, b.getPrice());
    }

}
