package part01.lesson04.task1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author indira [20.04.2019]
 * */
public class Main {

    public static void main(String[] args) {

        System.out.print("Input length of array: ");
        Scanner scanner = new Scanner(System.in);
        int length = Integer.valueOf(scanner.nextLine());

        System.out.print("Input max number of array element: ");
        int bound = Integer.valueOf(scanner.nextLine());

        //init new array
        Number[] array = fillArray(length, bound);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //creating of MathBox
        MathBox box = new MathBox(array);
        System.out.println("set is : " + box.getNumsSet());

        //testing hashCode() and equals() methods
        System.out.println("hashCode of box is : " + box.hashCode());
        Number[] array2 = array;
        MathBox box2 = new MathBox(array);
        MathBox box3 = new MathBox(array2);

        System.out.println("hashCode of box2 is : " + box2.hashCode());
        System.out.println("hashCode of box3 is : " + box3.hashCode());
        System.out.println(box2.equals(box3));
        System.out.println(box.equals(box3));
        System.out.println(box3.equals(box));

        //remove number
        int removeNumber = 6;
        box.removeNumber(removeNumber);
        System.out.println("from set removed number " + removeNumber + ": " + box.getNumsSet());

        box.splitter(3);
        System.out.println("splitted = " + box.getNumsSet());

        System.out.println("sum is: " + box.summator());

    }

    /**
     * method fill array
     * @param length size of array
     * @param bound max value of random number
     * */
    private static Number[] fillArray(int length, int bound){
        Number[] array = new Number[length];
        Random rand = new Random();
        for (int i = 0; i < length; i ++) {
            array[i] = rand.nextInt(bound);
        }
        return array;
    }
}
