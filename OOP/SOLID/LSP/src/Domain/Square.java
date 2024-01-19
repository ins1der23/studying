package Domain;

public class Square {

    protected int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    public int area() {
        return sideA * sideA;
    }

}
