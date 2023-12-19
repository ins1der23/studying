package Service;

public class CoinDispenser {
    private int cashBalance;

    public int getCashBalance() {
        return cashBalance;
    }

    public CoinDispenser() {
        this.cashBalance = 0;
    }

    private void cashIn(int amount) {
        this.cashBalance += amount;
    }

    private void cashOut(int amount) {
        this.cashBalance -= amount;
    }

    private Boolean checkPrice(int amount, int price) {
        return amount >= price ? true : false;
    }

    public int makePayment(int amount, int price) {
        if (checkPrice(amount, price)) {
            int change = amount - price;
            cashIn(amount);
            cashOut(change);
            return change;
        } else
            return -1;
    }

}
