package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс, описывающий посетителя магазина
 */

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name; // имя посетителя
    protected boolean isTakeOrder; // boolean значение создания заказа посетителем
    protected boolean isMakeOrder; // boolean значение получения заказа посетителем
    protected boolean isReturnOrder; // boolean значение возврата заказа посетителем

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
     * получение name
     */
    public abstract String getName();

}
