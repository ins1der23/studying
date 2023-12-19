package Domain;


public class Place {
    private static int idCounter;
    private int id;

    public int getId() {
        return id;
    }

    private int size;

    public int getSize() {
        return size;
    }

    private int productCounter;

    public int getProductCounter() {
        return productCounter;
    }

    public Place(int size) {
        this.id = ++idCounter;
        this.size = size;
        this.productCounter = 0;
    }

    public Boolean putProducts(int amount) {
        if (amount > freeSpace() || amount < 1) {
            return false;
        }
        productCounter += amount;
        return true;
    }

    public Boolean releaseProducts(int amount) {
        if (productCounter < amount) {
            return false;
        }
        productCounter -= amount;
        return true;
    }

    public int freeSpace() {
        return size - productCounter;
    }

}
