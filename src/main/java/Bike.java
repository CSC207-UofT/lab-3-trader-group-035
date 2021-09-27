public class Bike implements Drivable, Tradable{

    private int maxSpeed;

    public Bike() {
        this.maxSpeed = 20;
    }

    public String sound() {
        return "Ding!Ding!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed+=3;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed-=2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString(){
        return "Bike (Max speed: " + this.maxSpeed +")";
    }
}
