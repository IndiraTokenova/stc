package part01.lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FactorialCounter {

    public int[] getArray() {

        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.valueOf(scanner.nextLine());

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Random().nextInt(10000) + 1;
        }

        return array;
    }

    public List<Integer> getList() {
        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int listSize = Integer.valueOf(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i ++) {
            list.add(new Random().nextInt(1000) + 1);
        }
        return list;
    }

    public void countInOneThread(int array[]) {

        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            Factorial factorial = new Factorial(array[i]);
            factorial.calculate();
        }

        long finishTime = System.nanoTime();
        double benchTime = (finishTime - startTime) / 1e9;
        System.out.println("Время выполнения " + benchTime + " секунд");

    }

    public void countWithMultiThread(int array[]) {

        long startTime = System.nanoTime();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Thread thread = new Thread(new Factorial(array[i]));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long finishTime = System.nanoTime();
        double benchTime = (finishTime - startTime) / 1e9;
        System.out.println("Время выполнения " + benchTime + " секунд");
    }

}
