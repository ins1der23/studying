package Model.Domain;

public class Car extends Vehicle {

    private static double speedQ = 0.8;

    public Car(int maxSpeed) {
        super(maxSpeed);
        this.allowedSpeed = this.maxSpeed * speedQ;
    }
}
