package Classes;

/**
 * Класс, описывающий клиентоа, участвующих в акциях
 */

public class PromoClient extends Actor {

    private static int total = 2; // общее количество участников в акции
    private static int promoCounter = 1; // счетчик участников в акции

    private int id; // номер участника акции
    private String promoName; // название акции
    private boolean isPromo;

    /**
     * @param name
     * @param promoName
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.id = promoCounter++;
        this.promoName = promoName;
        if (id <= total) {
            isPromo = true;
        }
    }

    public int getId() {
        return id;
    }

    public String getPromoName() {
        return promoName;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean isTakeOrder) {
        if (isPromo)
            super.isTakeOrder = isTakeOrder;
    }

    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    public Actor getActor() {
        return this;
    }

    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }
}