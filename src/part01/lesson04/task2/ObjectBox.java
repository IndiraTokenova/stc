package part01.lesson04.task2;

import java.util.HashSet;
import java.util.Set;

public class ObjectBox {

    Set<Object> objects = new HashSet<>();

    public void addObject(Object object) {
        objects.add(object);
    }

    public boolean deleteObject(Object object) {
        return objects.remove(object);
    }

    public String dump() {
        return objects.toString();
    }

    public Set<Object> getObjects() {
        return objects;
    }
}
