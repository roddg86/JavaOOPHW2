package com.github.roddg86.impl;


import com.github.roddg86.parent.*;
import com.github.roddg86.parent.Runnable;

import java.io.Serializable;

/**
 * Сущьность кот
 */
public class Cat extends Animal implements Runnable, Illable, Serializable, Huntable, Speakable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }


    @Override
    public void getIll() {
        /**
         * метод Заболел
         */
        System.out.printf("%s заболел%n", this.getType());
    }

    @Override
    public int getRunSpeed() {
        int runSpeed = 20;
        System.out.printf("%s Скорость бега: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toGo() {
        System.out.printf("%s Я бегу!%n", getType());
    }

    @Override
    public void vaccination() {
        System.out.printf("%s Поставлен укол!%n", this.getType());
    }

    @Override
    public void bandaging() {
        System.out.printf("%s Сделана перевязка!%n", this.getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public void wakeUp() {
        System.out.println(getType() + ": проснулся");
    }

    @Override
    public void findFood() {
        String out = String.format("%s: нашел еду%n", getType());
        System.out.println(out);
    }

    @Override
    public void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    @Override
    public void toPlay() {
        System.out.printf("%s: поиграл%n", getType());
    }

    @Override
    public void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }

    @Override
    public void speak() {
        System.out.printf("%s: Мяу-Мяу-МЯУ!%n", getType());
    }
}