package Model.Domain;

public class Bus extends Vehicle {

    private static double speedQ = 0.6;

    public Bus(int maxSpeed) {
        super(maxSpeed);
        this.allowedSpeed = this.maxSpeed * speedQ;
    }
}
