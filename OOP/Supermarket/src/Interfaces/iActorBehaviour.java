package Interfaces;

import Classes.Actor;
/**
 * Интерфейс описывающий стандартные метолы для Actor
 */
public interface iActorBehaviour {

    public String getName();
    public void setName(String name);
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public boolean isCancelOrder();
    public void setTakeOrder(boolean isTakeOrder);
    public void setMakeOrder(boolean isMakeOrder);
    public Actor getActor();

}
