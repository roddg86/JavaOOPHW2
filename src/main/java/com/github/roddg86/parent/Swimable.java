package com.github.roddg86.parent;

/**
 * Интерфейс для умеющих плавать(способность сущности)
 */
public interface Swimable {
    /**
     * Получить скорость плавания
     */
    int getSwimSpeed();

    /**
     * Начать плыть
     */
    void toSwim();
}
