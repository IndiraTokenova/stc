package part01.lesson04.task3;

import part01.lesson04.task1.MathBox;
import part01.lesson04.task2.ObjectBox;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Number[] array = initArray(20);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        MathBox box = new MathBox(array);

        Number number = 200;
        box.addObject(number);

        System.out.println("number is added: " + box);

        Object o = "qwe";
        box.addObject(o);

    }

    private static Number[]  initArray(int size){
        Number[] array = new Number[size];
        Random rand = new Random();
        for (int i = 0; i < size; i ++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }


}
