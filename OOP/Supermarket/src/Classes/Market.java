package Classes;

import java.util.ArrayList;
import java.util.List;

import Classes.Services.Logger;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<Actor> queue;
    private Logger logger;

    public Market() {
        this.queue = new ArrayList<Actor>();
        this.logger = new Logger("marketLog.txt");
        logger.clearLog();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        logger.addEvent(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        logger.addEvent(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            logger.addEvent(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        refundOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                if (actor.isTakeOrder())
                    logger.addEvent(actor.getActor().getName() + " клиент получил свой заказ ");
                else
                    logger.addEvent(actor.getActor().getName() + " клиенту ОТКАЗАНО в получении заказа ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                logger.addEvent(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                logger.addEvent(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    @Override
    public void refundOrder() {
        for (Actor actor : queue) {
            if (actor.isReturnOrder()) {
                actor.setReturnOrder(false);
                logger.addEvent(actor.getActor().getName() + " клиент вернул заказ ");
            }
        }
    }

}