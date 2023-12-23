package Classes;

/**
 * 
 */
public class OrdinaryClient extends Actor {

    /**
     * 
     * @param name
     */

    public OrdinaryClient(String name) {
        super(name);
    }

    // Методы

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }

    public void setTakeOrder(boolean isTakeOrder) {
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

}
