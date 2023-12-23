package Classes;

public class SpecialClient extends Actor {

    private int idVip;

    /**
     * Констурктор
     * 
     * @param name
     * @param idVip
     */
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    public int getIdVip() {
        return idVip;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
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

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

}
