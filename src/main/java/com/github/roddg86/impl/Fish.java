package com.github.roddg86.impl;


import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Swimable;

import java.io.Serializable;

/**
 * Плавающие
 * Сущность рыба
 */
public class Fish extends Animal implements Swimable, Serializable {
    public Fish(String name, String color) {
        super(name, color);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public int getSwimSpeed() {
        int runSpeed = 50;
        System.out.printf("%s Скорость заплыва: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toSwim() {
        System.out.printf("%s Уже плыву%n", getType());
    }
}
