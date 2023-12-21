package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser coinDispenser;
    private List<Product> assortment;
    private Display display;

    public VendingMachine(int maxPlaces, int placeSize) {
        this.holder = new Holder(maxPlaces, placeSize);
        this.coinDispenser = new CoinDispenser();
        this.display = new Display();
        assortment = new ArrayList<>();
    }

    public List<Product> getAssortment() {
        return assortment;
    }

    public void setAssortment() {
        for (Map.Entry<Product, Integer> productNote : holder.getRemains().entrySet()) {
            if (productNote.getValue() > 0) {
                assortment.add(productNote.getKey());
            }
        }
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    public Display getDisplay() {
        return display;
    }

    public void loadHolder(HashMap<Product, Integer> toLoad) {
        for (Map.Entry<Product, Integer> productNote : toLoad.entrySet()) {
            Product product = productNote.getKey();
            int amount = productNote.getValue();
            if (holder.acceptProduct(product, amount))
                display.showString(product.getName() + " успешно добавлен");

            else {
                display.showString("Ошибка добавления " + product.getName());
            }
        }
    }

    public String getPriceList() {
        String output = new String();
        int i = 1;
        for (Product product : assortment) {
            output += i++ + ". " + product.toString() + "\n";
        }
        return output;
    }

    public void buyProduct(Product product, int moneyIn) {
        int price = product.getPrice();
        int change = coinDispenser.makePayment(moneyIn, price);
        if (change < 0) {
            display.showString("Мало денег");
            return;
        }
        Boolean result = holder.releaseProduct(product, 1);
        if (!result) {
            display.showString("К сожалению не можем выдать продукт");
            return;
        }
        display.showString("Возьмите ваш продукт: " + product.getName());
        if (change > 0) {
            display.showString("Возмите вашу сдачу - " + change + "р.");
        }
    }

}
