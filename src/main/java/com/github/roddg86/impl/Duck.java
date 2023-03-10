package com.github.roddg86.impl;


import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Clinic;
import com.github.roddg86.parent.Flyable;
import com.github.roddg86.parent.Speakable;
import com.github.roddg86.parent.Swimable;
import com.github.roddg86.parent.Runnable;


/**
 * Сущьность утка
 */
public class Duck extends Animal implements Flyable, Speakable, Swimable, Runnable, Clinic {
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
        int flightSpeed = 30;
        System.out.printf("%s Скорость полета: %d%n", this.getType(), flightSpeed);
        return flightSpeed;
    }

    @Override
    public void speak() {
        System.out.printf("%s: Кря-Кря!!%n", getType());
    }

    @Override
    public int getSwimSpeed() {
        int runSpeed = 10;
        System.out.printf("%s Скорость заплыва: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toSwim() {
        System.out.printf("%s Уже плыву%n", getType());
    }

    @Override
    public int getRunSpeed() {
        int runSpeed = 10;
        System.out.printf("%s Скорость бега: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toGo() {
        System.out.printf("%s Я бегу%n", getType());
    }
}
