package com.github.roddg86.impl;

import com.github.roddg86.parent.Animal;
import com.github.roddg86.parent.Clinic;
import com.github.roddg86.parent.Huntable;
import com.github.roddg86.parent.Illable;
import com.github.roddg86.parent.Runnable;
import com.github.roddg86.parent.Speakable;

/**
 * Сущьность кот
 */
public class Cat extends Animal implements Runnable, Illable, Huntable, Speakable, Clinic {
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

    /**
     * Метод вызывает другие метода попорядку, чтобы невозможно было нарушить порядок
     */
    @Override
    public void toHunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
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

    private void toPlay() {
        System.out.printf("%s: поиграл%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }

    @Override
    public void speak() {
        System.out.printf("%s: Мяу-Мяу-МЯУ!%n", getType());
    }
}