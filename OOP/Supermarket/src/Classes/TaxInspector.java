package Classes;

/**
 * Класс, описывающий налогвого инспектора
 */
public class TaxInspector extends Actor {

    /**
     * Конструткор, автоматически присваивающий имя налоговому инспектору
     */
    public TaxInspector() {
        this.name = "Tax audit";
    }

    /**
     * Оверрайд геттера name родительского класса
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Геттер isTakeOrder
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Геттер isMakeOrder
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Геттер isReturnOrder
     */
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    /**
     * Сеттер для name
     */
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Сеттер isMakeOrder
     */
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    /**
     * Сеттер isTakeOrder
     */
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    /**
     * Сеттер isReturnOrder
     */
    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }

    /**
     * Получение ссылки на самого себя
     */
    public Actor getActor() {
        return this;
    }
}