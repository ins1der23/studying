package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {

    public String getName();
    public void setName(String name);
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean isTakeOrder);
    public void setMakeOrder(boolean isMakeOrder);
    public Actor getActor();

}
