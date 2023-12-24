package Classes;

/**
 * Класс, описывающий ВИП Клиентов
 */
public class SpecialClient extends Actor {

    private int idVip;

    /**
     * Конструктор принимает в качестве аргмументов имя и id вип-клиента
     * 
     * @param name
     * @param idVip
     */
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    /**
     * Оверрайд геттера name родительского класса
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Геттер IdVip
     */
    public int getIdVip() {
        return idVip;
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
