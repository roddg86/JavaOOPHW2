package com.github.roddg86.impl;

import com.github.roddg86.parent.Doctor;
import com.github.roddg86.parent.Speakable;
import com.github.roddg86.parent.Treatable;

import java.io.Serializable;

/**
 * Сущьность человек
 */
public class Human extends Doctor implements Treatable, Speakable {

    /**
     * Конструктор класса
     *
     * @param name       имя доктора
     * @param experience опыт работы доктора
     */
    public Human(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void vaccination() {
        System.out.printf("%s Ставлю прививку!%n", this.getType());
    }

    @Override
    public void bandaging() {
        System.out.printf("%s Делаю перевязку!%n", this.getType());
    }

    @Override
    public void speak() {
            System.out.printf("%s: Следующий пациент на прием!%n", getType());
    }
}
