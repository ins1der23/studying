package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Domain.Place;
import Domain.Product;

public class Holder {
    private LinkedHashMap<Place, Product> store;
    public LinkedHashMap<Place, Product> getStore() {
        return store;
    }

    private int maxPlaces;
    private LinkedHashMap<Product, Integer> assortment;

    public HashMap<Product, Integer> getAssortment() {
        assortment.clear();
        for (Map.Entry<Place, Product> cell : store.entrySet()) {
            Place place = cell.getKey();
            if (place.getProductCounter() > 0) {
                Product product = cell.getValue();
                assortment.put(product, place.getProductCounter());
            }
        }
        return this.assortment;
    }

    public Holder(int maxPlaces, int placeSize) {
        this.maxPlaces = maxPlaces;
        this.store = new LinkedHashMap<>(this.maxPlaces);
        for (int i = 0; i < maxPlaces; i++) {
            Place place = new Place(placeSize);
            store.put(place, null);
        }
        this.assortment = new LinkedHashMap<>();
    }

    /**
     * Метод добавления продукта в Holder, возвращает true при успешном добавлении
     * 
     * @param product продукт для добавления
     * @param amount  количество для добавления
     */
    public Boolean acceptProduct(Product product, int amount) {
        Boolean result = false;
        for (Map.Entry<Place, Product> cell : store.entrySet()) {
            Place place = cell.getKey();
            if (place.getId() == product.getPlace()) {
                result = place.putProducts(amount);
                store.put(place, product);
            }
        }
        return result;

    }

    /**
     * Метод выдачи продукта из Holder, возвращает true при успешной выдаче
     * 
     * @param product продукт для выдачи
     * @param amount  количество для выдачи
     * @return
     */
    public boolean releaseProduct(Product product, int amount) {
        Boolean result = false;
        for (Map.Entry<Place, Product> cell : store.entrySet()) {
            if (product == cell.getValue()) {
                Place place = cell.getKey();
                result = place.releaseProducts(amount);
                store.put(place, product);
            }
        }
        return result;
    }

}
