package com.github.roddg86.parent;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class Animal {
    @ToString.Include(name = "Имя")
    private String name;
    @ToString.Include(name = "Цвет")
    private final String color;
    @ToString.Include(name = "Количество ног")
    private int legsCount;

    /**
     * поле для подсчета сколько наследников у класса Animal
     * @see animalsCount это счетчик всегда создается с нуля
     */
    private static int animalsCount = 0;

    /**
     *
     * @param name имя животного
     * @param color цвет животного
     * @param legsCount количество ног
     */
    public Animal(String name, String color, int legsCount) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;
        animalsCount++;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
    }

    public Animal(String color, int legsCount) {
        this("Безымянный", color);
        this.legsCount = legsCount;
    }

    public Animal(String name){
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    /**
     * Метод подсчета количества наследников класса Animal
     * @return возвращает количество наследников класса Animal
     *
     */
    public static int getAnimalsCount(){
        return animalsCount;
    }
}
