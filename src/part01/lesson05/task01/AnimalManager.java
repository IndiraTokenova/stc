package part01.lesson05.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalManager {

    /**
     * Разработать программу – картотеку домашних животных. У каждого животного есть уникальный идентификационный номер,
     * кличка, хозяин (объект класс Person с полями – имя, возраст, пол), вес.
     *
     * Реализовать:
     *
     * + метод добавления животного в общий список (учесть, что добавление дубликатов должно приводить к исключительной ситуации)
     * + поиск животного по его кличке (поиск должен быть эффективным)
     * + изменение данных животного по его идентификатору
     * - вывод на экран списка животных в отсортированном порядке. Поля для сортировки –  хозяин, кличка животного, вес.
     * */

    private List<Animal> animals = new ArrayList<>();

    /**
     * method adds animal to set animals
     * @param animal
     * */
    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    /**
     * method search animal by nickName
     * @param nickName name of Animal
     * @return searched Animal
     * */
    public Animal searchAnimalByNickName(String nickName) {
        for (Animal animal: animals) {
            if (animal.getNickName().equals(nickName)) {
                return animal;
            }
        }
        return null;
    }

    /**
     * method change animal data by animal ID
     * @param newAnimal another Animal with new data
     * */
    public void searchAnimalByNickName(Animal newAnimal) {
        for (Animal animal: animals) {
            if (animal.getID() == newAnimal.getID()) {
                animal = newAnimal;
            }
        }
    }

    /**
     * method sort animals list
     * */
    public void sortAnimals() {
       // Collections.sort(animals, Comparator.comparing());
    }

}
