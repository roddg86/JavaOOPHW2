package com.github.roddg86.impl;

import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Flyable;
import com.github.roddg86.parent.Huntable;
import com.github.roddg86.parent.Illable;

import java.io.Serializable;

/**
 * Сущность Орел
 */
public class Eagle extends Animal implements Flyable, Illable, Serializable, Huntable {

    public Eagle(String name, String color) {
        super(name, color, 2);
    }

    public Eagle(String name) {
        this(name, null);
    }

    /**
     * пришел из интерфейса Flyable
     *
     * @return возвращает скорость с которой летит орел
     */
    @Override
    public int getFlightSpeed() {
        int flightSpeed = 100;
        System.out.printf("%s Скорость полета: %d%n", this.getType(), flightSpeed);
        return flightSpeed;
    }

    @Override
    public void toFly() {
            System.out.printf("%s Полетел!%n", this.getType());
    }


    /**
     * пришел из интерфейса Illable
     */
    @Override
    public void getIll() {

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
}
