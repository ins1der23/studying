package Domain;

public class Car {

    private iStartEngine engine;

    public Car(iStartEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
