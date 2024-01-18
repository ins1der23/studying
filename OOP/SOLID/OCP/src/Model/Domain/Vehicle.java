package Model.Domain;

public abstract class Vehicle implements iVehicle {
    protected int maxSpeed;
    protected double allowedSpeed;

    protected static double speedQ = 0;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.allowedSpeed = this.maxSpeed * speedQ;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getAllowedSpeed() {
        return allowedSpeed;
    }

}
