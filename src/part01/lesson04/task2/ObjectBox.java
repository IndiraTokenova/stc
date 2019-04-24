package part01.lesson04.task2;

import java.util.HashSet;
import java.util.Set;

public class ObjectBox {

    /**
     * Задание 2. Создать класс ObjectBox, который будет хранить коллекцию Object.
     * У класса должен быть метод addObject, добавляющий объект в коллекцию.
     * У класса должен быть метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его.
     * Должен быть метод dump, выводящий содержимое коллекции в строку.
     * */

    Set<Object> objects = new HashSet<>();

    public void addObject(Object object) {
        objects.add(object);
    }

    public boolean deleteObject(Object object) {
        return objects.remove(object);
    }

    public void dump() {
        System.out.println(objects);
    }

    public Set<Object> getObjects() {
        return objects;
    }
}
