package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Интерфейс описывающий стандартные метолы для Market
 */

public interface iMarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
