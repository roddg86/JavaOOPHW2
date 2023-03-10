package com.github.roddg86.impl;


import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Flyable;

import java.io.Serializable;

/**
 * Сущьность утка
 */
public class Duck extends Animal implements Flyable, Serializable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        this(name, null);
    }


    /**
     * {@link Flyable#toFly()}
     */
    @Override
    public void toFly() {
        System.out.printf("%s Полетел!%n", this.getType());
    }

    @Override
    public int getFlightSpeed() {
        int flightSpeed = 10;
        System.out.printf("%s Скорость полета: %d%n", this.getType(), flightSpeed);
        return flightSpeed;
    }
}
