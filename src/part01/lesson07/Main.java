package part01.lesson07;

public class Main {


    public static void main(String[] args) {

        FactorialCounter factorialCounter = new FactorialCounter();
        int array[] = factorialCounter.getArray();
        factorialCounter.countWithMultiThread(array);
        factorialCounter.countInOneThread(array);

    }

}
