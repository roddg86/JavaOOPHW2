package com.github.roddg86;


import com.github.roddg86.impl.*;
import com.github.roddg86.parent.*;
import com.github.roddg86.parent.Runnable;
import com.github.roddg86.veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Барсик","Белый"))
                .addAnimal(new Duck("Дональд","Черный"))
                .addAnimal(new Bear("Тайга", "Бурый"));

        //vetClinic.getRunnable().forEach(System.out::println);
        //vetClinic.getFlyable().forEach(System.out::println);
        //vetClinic.getSerializable().forEach(System.out::println);
        //vetClinic.getSpeakable().forEach(System.out::println);
        //vetClinic.getClinic().forEach(System.out::println);

        Bear bear = new Bear("Медведь");
        bear.toHunt();



//        for (int i = 0; i < vetClinic.getAnimals().size(); i++) {
//            System.out.print(vetClinic.getAnimals().get(i).getName() + " ");
//        }
//        System.out.println();

        Human human = new Human("Айболит", 5);
        human.speak();
        human.treat();

        /**
         * Список для наследников интерфейса Illable(способных заболеть)
         */
        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("Барсик"));
        //illables.add(new Human());

        //Выведем тех кто заболел
        for (Illable illable : illables
        ) {
            
            illable.getIll();;
        }

        /**
         * Список для наследников интерфейса Flyable(умеющих летать)
         */
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle("Самоцвет", "Огненный"));
        flyables.add(new Duck("Donald", "Черный"));

        //Выведем тех кто летит
        for (Flyable fly : flyables
        ) {
            fly.toFly();
            fly.getFlightSpeed();
        }

        /**
         * Список для наследников интерфейса Runnable(умеющих бегать)
         */
        List<Runnable> runnables = new ArrayList<>();
        runnables.add(new Bear("Тайга", "Бурый"));
        runnables.add(new Cat("Пушок", "Белый"));

        // Выведем тех кто бежит
        for (Runnable run : runnables
        ) {
            run.toGo();
            run.getRunSpeed();
        }

        /**
         * Список для наследников интерфейса Swimable(умеющих плавать)
         */
        List<Swimable> swimables = new ArrayList<>();
        swimables.add(new Fish("Амиго", "Желтый"));
        swimables.add(new Octopus("Бленд", "Коричневый"));

        // Выведем тех кто плывет
        for (Swimable swim : swimables
        ) {
            swim.toSwim();
            swim.getSwimSpeed();
        }

        System.out.printf("Количество наследников класса Animal = %d", Animal.getAnimalsCount());

    }
}
