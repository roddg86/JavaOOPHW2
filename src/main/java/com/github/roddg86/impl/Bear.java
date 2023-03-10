package com.github.roddg86.impl;

import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Illable;
import com.github.roddg86.parent.Runnable;

import java.io.Serializable;

/**
 * Бегающие
 * Сущность медведь
 */
public class Bear extends Animal implements Runnable, Illable, Serializable {
    public Bear(String name, String color) {
        super(name, color, 4);
    }

    public Bear(String name) {
        this(name, null);
    }

    public void speak() {
        System.out.printf("%s говорит: Рычание-Рычание!%n", getType());
    }

    @Override
    public int getRunSpeed() {
        int runSpeed = 60;
        System.out.printf("%s Скорость бега: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toGo() {
        System.out.printf("%s Я бегу%n", getType());
    }

    @Override
    public void getIll() {

    }

    @Override
    public void vaccination() {

    }

    @Override
    public void bandaging() {

    }
}
