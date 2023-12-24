package Classes;

import java.util.ArrayList;
import java.util.List;

import Classes.Services.Logger;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс,описывающий молель магазина
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<Actor> queue; // Переменная для очеред посетителей
    private Logger logger; // Переменная для логирования Market

    /**
     * Коструктор, создающий пустую очередь и пустой файл журнала
     */
    public Market() {
        this.queue = new ArrayList<Actor>();
        this.logger = new Logger("marketLog.txt");
        logger.clearLog();
    }

    /**
     * Метод фиксирующий клиентов, пришедших в магазин
     */
    public void acceptToMarket(Actor actor) {
        logger.addEvent(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод для добавления клиентов в очередь
     */
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        logger.addEvent(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод фиксирующий клиентов, покидающих магазин, удалет клиента из очереди
     */
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            logger.addEvent(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * Метод обновляющий состояния клиентов
     */
    public void update() {
        takeOrder();
        giveOrder();
        refundOrder();
        releaseFromQueue();
    }

    /**
     * Метод выдачи заказа клиенту. Присваивает isTakeOrder true
     */
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

    /**
     * Метод удаления клиентов из очереди в случае получения или отмены заказв
     */
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder() || actor.isCancelOrder()) {
                releaseActors.add(actor.getActor());
                logger.addEvent(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод получения заказа от клиента. Присваивает isMakeOrder true, если клиент
     * в очереди
     */
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                logger.addEvent(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    /**
     * Метод возврата заказа клиентом. Проверяет условие isReturnOrder и присваиват
     * false в случае успешной проверки
     */
    public void refundOrder() {
        for (Actor actor : queue) {
            if (actor.isReturnOrder()) {
                actor.setReturnOrder(false);
                logger.addEvent(actor.getActor().getName() + " клиент вернул заказ ");
            }
        }
    }

}