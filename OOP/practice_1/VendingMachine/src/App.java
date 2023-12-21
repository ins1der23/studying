
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

import Domain.Bottle;
import Domain.HotDrinks;
import Domain.Product;
import Frame.SimpleWindow;
import Service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Lays", 140, 1);
        Product item2 = new Bottle("Coca-cola", 120, 2, 0.33);
        Product item3 = new Product("Milka", 50, 3);
        Product item4 = new Bottle("AquaMineralle", 110, 4, 0.5);
        Product item5 = new HotDrinks("Эспрессо", 50, 5, 60);
        Product item6 = new HotDrinks("Капучино", 70, 6, 65);
        Product item7 = new HotDrinks("Горячий шоколад", 70, 7, 65);
        HashMap<Product, Integer> products = new HashMap<>();
        products.put(item1, 7);
        products.put(item2, 6);
        products.put(item3, 8);
        products.put(item4, 3);
        products.put(item5, 1);
        products.put(item6, 2);
        products.put(item7, 4);

        VendingMachine someMachine = new VendingMachine(7, 10);
        someMachine.loadHolder(products);
        someMachine.setAssortment();
        var priceList = someMachine.getPriceList();
        someMachine.getDisplay().showString(priceList);
        var remains = someMachine.getHolder();
        someMachine.getDisplay().showString(remains.toString());
        someMachine.buyProduct(item5, 120);
        System.out.println();
        someMachine.getDisplay().showString(remains.toString());

        SimpleWindow myWindow = new SimpleWindow("Vending Machine", priceList);
        myWindow.setVisible(true);
    }
}
