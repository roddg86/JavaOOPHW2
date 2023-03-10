package com.github.roddg86.veterinary;

import com.github.roddg86.parent.*;
import com.github.roddg86.parent.Runnable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    /**
     * поле хранит в себе всех животных пациентов
     */
    private final List<Animal> animals;

    /**
     * Метод позволяет принимать в клинику нового пациента
     * @param animal - параметр пациент который поступает в клинику
     *
     * @return this - фишка java для каскадного вызова встроенных методов, отголосок паттерна билдер.
     */
    public VetClinic addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }

    /**
     * Конструктор
     */
    public VetClinic() {
        // инициализация поля в конструкторе, является хорошим тоном
        this.animals = new ArrayList<>();
    }

    /**
     * Метод получает всех животных
     * @return список животных
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Метод получает всех кто есть в клинике включая людей
     * @return список присутствующих в клинике
     */
    public List<Serializable> getSerializable(){
        List<Serializable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Serializable){
                result.add((Serializable) animal);
            }
        }
        return result;
    }

    /**
     * Метод получает всех кто разговаривает
     * @return список разговаривающих
     */
    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Speakable){
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    /**
     * Метод получает всех павающх животных
     * @return список плавающих животных
     */
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    /**
     * Метод получает всех летающих животных
     * @return список летающих животных
     */
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    /**
     * Метод получает всех бегающих животных
     * @return список бегающих животных
     */
    public List<Runnable> getRunnable(){
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Runnable){
                result.add((Runnable) animal);
            }
        }
        return result;
    }
}
