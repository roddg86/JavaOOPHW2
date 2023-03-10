package com.github.roddg86.parent;

import lombok.Data;
import lombok.ToString;

/**
 * Сущьность доктор(Врач ветеринар)
 */
@Data
@ToString
public abstract class Doctor {
    @ToString.Include(name = "Имя")
    private String name;

    @ToString.Include(name = "Опыт работы")
    private int experience;

    /**
     * Конструктор класса
     * @param name имя доктора
     * @param experience опыт работы доктора
     */
    public Doctor(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    /**
     * Получить тип обьекта
     * @return возвращает тип обьекта
     */
    public String getType() {
        return this.getClass().getSimpleName();
    }


}
