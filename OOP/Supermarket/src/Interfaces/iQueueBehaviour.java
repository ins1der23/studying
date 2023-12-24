package Interfaces;

import Classes.Actor;

/**
 * Интерфейс описывающий стандартные метолы для очереди Market
 */
public interface iQueueBehaviour {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
    void refundOrder();
}
