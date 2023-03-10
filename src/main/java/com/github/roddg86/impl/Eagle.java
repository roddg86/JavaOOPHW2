package com.github.roddg86.impl;

import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Clinic;
import com.github.roddg86.parent.Flyable;
import com.github.roddg86.parent.Huntable;
import com.github.roddg86.parent.Illable;
import com.github.roddg86.parent.Runnable;
import com.github.roddg86.parent.Speakable;

/**
 * Сущность Орел
 */
public class Eagle extends Animal implements Flyable, Illable, Huntable, Runnable, Speakable, Clinic {

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

    /**
     * Метод вызывает другие метода попорядку, чтобы невозможно было нарушить порядок
     */
    @Override
    public void toHunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    private void wakeUp() {
        System.out.println(getType() + ": проснулся");
    }

    private void findFood() {
        String out = String.format("%s: нашел еду%n", getType());
        System.out.println(out);
    }

    private void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }

    @Override
    public int getRunSpeed() {
        int runSpeed = 20;
        System.out.printf("%s Скорость бега: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toGo() {
        System.out.printf("%s Я бегу%n", getType());
    }

    @Override
    public void speak() {
        System.out.printf("%s: Крик орла!!%n", getType());
    }
}
