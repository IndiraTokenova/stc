package part01.lesson02.task03;

/**
 * @author indira [19.04.2019]
 */
public class SamePersonException extends Exception {

    private String name;
    private int age;

    public SamePersonException(String name, int age) {
        this.name = name;
        this.age = age;
        printException();
    }

    /**
     * print message of exception
     * */
    private void printException() {
        System.out.println("same persons name is " + name + " and age is " + age);
    }

}
