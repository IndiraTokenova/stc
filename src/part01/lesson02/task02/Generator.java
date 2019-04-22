package part01.lesson02.task02;

import java.util.Random;

public class Generator {

    /**
     * Составить программу, генерирующую N случайных чисел. Для каждого числа k вычислить квадратный корень q.
     * Если квадрат целой части q числа равен k, то вывести это число на экран. Предусмотреть что первоначальные
     * числа могут быть отрицательные, в этом случае генерировать исключение.
     * */

    public static void main(String[] args) {

        generate(100, 100, -100);
        System.out.println("-------------------------");
        generate(500, 1000, -1000);

    }

    private static void generate(int n, int max, int min) {
        int[] arr = new int[n];

        for(int i= 0; i < n ; i++) {
            arr[i] = new Random().nextInt(max + 1 - min) + min;

            if (arr[i] >= 0) {

                try {
                    int hole = ((int) Math.sqrt(arr[i]));

                    if (hole * hole == arr[i]) {
                        System.out.println(arr[i]);
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException();
                }
            }
        }

    }

}
