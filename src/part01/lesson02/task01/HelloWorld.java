package part01.lesson02.task01;

/**
 * @author indira [18.04.2019]
 * */
public class HelloWorld {

    public static void main(String[] args) {


        try {
            throwNullPointerExc();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throwArrInd();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throwCustomException(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Method throw NullPointerException
     */
    private static void throwNullPointerExc() {

        String str1 = null;
        String str2 = "Hello World!";

        if (str1.equals(str2)) {
            System.out.println(str2);
        }
    }

    /**
     * Method throw ArrayIndexOutOfBoundsException
     */
    private static void throwArrInd() {
        int[] a = new int[10];
        System.out.println(a[11]);
    }

    /**
     * Method throw ArithmeticException
     *
     * @param a number
     * */
    private static void throwCustomException(int a) {
        if(a < 0) {
            throw new ArithmeticException("a is a negative number");
        }
    }

}

