package Service;

import java.util.ArrayList;
import java.util.List;
import Domain.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser coinDispenser;
    private List<Product> assortment;

    public VendingMachine(Holder holder, CoinDispenser coinDispenser) {
        this.holder = holder;
        this.coinDispenser = coinDispenser;
        assortment = new ArrayList<>();
    }

    public void buyProduct(Product product, int moneyIn) {
        int price = product.getPrice();
        int change = coinDispenser.makePayment(moneyIn, price);
        if (change < 0) {
            System.out.println("Мало денег");
            return;
        }
        Boolean result = holder.releaseProduct(product, 1);
        if (!result) {
            System.out.println("К сожалению не можем выдать продукт");
            return;
        }
        System.out.println("Возьмите ваш продукт");
        if (change > 0) {
            System.out.println("Возмите вашу сдачу - " + change + "р.");
        }
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }

    public List<Product> getProducts() {
        return assortment;
    }

    public void setProducts(List<Product> assortment) {
        this.assortment = assortment;
    }

}
