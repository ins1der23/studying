package Classes;


public class TaxInspector extends Actor {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Tax audit";
    }

    public String getName() {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }

}