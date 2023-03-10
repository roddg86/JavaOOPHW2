package com.github.roddg86.parent;

/**
 * Интерфейс для умеющих летать(способность сущности)
 */
public interface Flyable {
    /**
     * Получить скорость полета
     */
    int getFlightSpeed();

    /**
     * Начать полет
     */
    void toFly();
}
