import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrinks;
import Domain.Product;
import Service.CoinDispenser;
import Service.Holder;
import Service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product item1 = new Product("Lays", 140, 1);
        Product item2 = new Product("Coca-cola", 120, 2);
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
        products.put(item5,11);
        products.put(item6, 2);
        products.put(item7, 4);




        Holder holder = new Holder(7, 10);
        CoinDispenser dispenser = new CoinDispenser();
        VendingMachine someMachine = new VendingMachine(holder, dispenser);

        holder.acceptProduct(item1, 4);
        holder.acceptProduct(item2, 5);
        holder.acceptProduct(item3, 6);
        holder.acceptProduct(item4, 7);
        holder.acceptProduct(item5, 4);
        holder.acceptProduct(item6, 3);
        holder.acceptProduct(item7, 3);
        // System.out.println(holder.getStore());
        System.out.println(holder.getAssortment());
        holder.releaseProduct(item3, 7);
        System.out.println(holder.getAssortment());




        
    }
}
