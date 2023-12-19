package Domain;

public class HotDrinks extends Product {

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrinks(String name, int price, int place, int temperature) {
        super(name, price, place);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", температура напитка - " + temperature;
    }

}
