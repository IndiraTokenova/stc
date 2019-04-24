package part01.lesson4.task1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //init new array
        Number[] array = initArray(15, 20);
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

    private static Number[]  initArray(int size, int bound){
        Number[] array = new Number[size];
        Random rand = new Random();
        for (int i = 0; i < size; i ++) {
            array[i] = rand.nextInt(bound);
        }
        return array;
    }
}
