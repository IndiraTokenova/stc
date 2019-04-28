package part01.lesson02.task02;

public class NegativeNumberException extends Exception {

    public NegativeNumberException(int a) {
        System.out.println(a + " is a Negative number");
    }

}
