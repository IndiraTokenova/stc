package part01.lesson02.task01;

import java.util.Scanner;

/**
 * @author indira [18.04.2019]
 * */
public class HelloWorld {

    public static void main(String[] args) {

        try {
            throwNullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throwArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.print("Input negative number: ");
            Scanner scanner = new Scanner(System.in);
            int number = Integer.valueOf(scanner.nextLine());
            throwCustomException(number);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Method throw NullPointerException
     */
    private static void throwNullPointerException() {
        String str1 = null;
        System.out.println(str1.charAt(5));
    }

    /**
     * Method throw ArrayIndexOutOfBoundsException
     */
    private static void throwArrayIndexOutOfBoundsException() {
        int[] a = new int[10];
        System.out.println(a[11]);
    }

    /**
     * Method throw ArithmeticException
     * @param number negative integer number
     * */
    private static void throwCustomException(int number) {
        if(number < 0) {
            throw new ArithmeticException(number + " is a negative number");
        }
    }

}

