package Domain;

public class Rectangle extends Square {
    
    protected int sideB;

    public Rectangle(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }

        public int area() {
        return sideA * sideB;
    }
}