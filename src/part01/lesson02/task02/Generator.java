package part01.lesson02.task02;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * @author indira
 * */
public class Generator {

    public static void main(String[] args) {

        int[] array = generateArray();
        checkSQRT(array);

        int[] array2 = generateArray();
        checkSQRT(array2);

    }

    /**
     * Method checks square root of every element of array
     * */
    private static void checkSQRT(int[] array) {

        try {

            for(int i= 0; i < array.length ; i++) {
                if (array[i] >= 0) {
                    int whole = (int) Math.round(sqrt(array[i]));
                    if (whole * whole == array[i]) {
                        System.out.println(array[i]);
                    }
                } else {
                    throw new NegativeNumberException(array[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method generates array with int elements. User should enter to console
     * number of elements, max and min value.
     * @return generated array
     * */
    private static int[] generateArray() {

        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.valueOf(scanner.nextLine());

        System.out.print("Input min value: ");
        int minValue = Integer.valueOf(scanner.nextLine());

        System.out.print("Input max value: ");
        int maxValue = Integer.valueOf(scanner.nextLine());

        int[] generatedArray = new int[arraySize];
        for(int i= 0; i < arraySize ; i++) {
            generatedArray[i] = new Random().nextInt(maxValue * 2) + minValue;
        }
        return generatedArray;
    }

}
