package com.github.roddg86.parent;

/**
 * Интерфейс для умеющих бегать(способность сущности)
 */
public interface Runnable {
    /**
     * Получить скорость бега
     */
    int getRunSpeed();

    /**
     * Начать бег
     */
    void toGo();
}
