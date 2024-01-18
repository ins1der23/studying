import Model.Domain.Bicycle;
import Model.Domain.Bus;
import Model.Domain.Car;

public class App {

  public static void main(String[] args) {

    Car bmw = new Car(200);
    Bus pazik = new Bus(100);
    Bicycle kama = new Bicycle(30);

    System.out.println(bmw.getAllowedSpeed());
    System.out.println(pazik.getAllowedSpeed());
    System.out.println(kama.getAllowedSpeed());;
  }
}
