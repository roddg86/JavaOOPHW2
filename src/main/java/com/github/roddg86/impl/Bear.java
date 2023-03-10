package com.github.roddg86.impl;


import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Clinic;
import com.github.roddg86.parent.Huntable;
import com.github.roddg86.parent.Illable;
import com.github.roddg86.parent.Runnable;
import com.github.roddg86.parent.Speakable;
import com.github.roddg86.parent.Swimable;

/**
 * Бегающие
 * Сущность медведь
 */
public class Bear extends Animal implements Runnable, Illable, Huntable, Swimable, Speakable, Clinic {
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
    public int getSwimSpeed() {
        int runSpeed = 10;
        System.out.printf("%s Скорость заплыва: %d%n", this.getType(), runSpeed);
        return runSpeed;
    }

    @Override
    public void toSwim() {
        System.out.printf("%s Уже плыву%n", getType());
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
        System.out.printf("%s: поохотился%n", getType());
    }

    private void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }
}
