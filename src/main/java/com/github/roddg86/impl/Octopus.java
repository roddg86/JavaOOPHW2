package com.github.roddg86.impl;


import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Swimable;

import java.io.Serializable;

/**
 * Плавающие
 * Сущность осьминог
 */
public class Octopus  extends Animal implements Swimable, Serializable {
    public Octopus(String name, String color) {
        super(name, color, 8);
    }

    public Octopus(String name) {
        this(name, null);
    }

    @Override
    public int getSwimSpeed() {
        int runSpeed = 43;
        System.out.printf("%s Скорость заплыва: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toSwim() {
        System.out.printf("%s Уже плыву%n", getType());
    }
}
