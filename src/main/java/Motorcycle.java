/* A sample class that implements the given interfaces.
 */
public class Motorcycle implements Drivable, Tradable {
    private int maxSpeed;

    public Motorcycle() {
        this.maxSpeed = 1;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
