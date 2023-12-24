package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс, описывающий посетителя магазина
 */

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name; // имя посетителя
    protected boolean isMakeOrder; // boolean значение создания заказа
    protected boolean isTakeOrder; // boolean значение получения заказа
    protected boolean isCancelOrder; // boolean значение отмены заказа
    protected boolean isReturnOrder; // boolean значение возврата заказа

    /**
     * Конструктор c парметрами
     * 
     * @param name Имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Конструктор без параметров
     */
    public Actor() {
        this.name = new String();
    }

    // Методы

    /**
     * получение значения isTakeOrder
     */
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * получение значения isMakeOrder
     */
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * получение значения isCancelOrder
     */
    public boolean isCancelOrder() {
        return isCancelOrder;
    }

    /**
     * получение name
     */
    public abstract String getName();

}
