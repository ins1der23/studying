package Domain;

import Domain.Interfaces.iShape2D;

public class Circle implements iShape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}
