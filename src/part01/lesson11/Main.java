package part01.lesson11;

import part01.lesson07.Factorial;
import part01.lesson07.FactorialCounter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FactorialCounter counter = new FactorialCounter();
        List<Integer> intList = counter.getList();
        intList.forEach(t -> new Factorial(t).calculate());
    }

}
