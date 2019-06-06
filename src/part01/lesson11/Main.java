package part01.lesson11;

import part01.lesson07.Factorial;
import part01.lesson07.FactorialCounter;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        FactorialCounter counter = new FactorialCounter();
        List<Integer> intList = counter.getList();
        intList.forEach(t -> new Factorial(t).calculate());

        System.out.println(intList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println(intList.stream().filter(p -> p > number).collect(Collectors.toList()));
    }

}
