package part01.lesson02.task03;

/**
 * @author indira [19.04.2019]
 * */
public class Main {

    public static void main(String[] args) {

        try {
            PersonManager manager = new PersonManager();
            PersonsSorter sorter = new PersonsSorter();

            Person[] persons1 = manager.fillPersonsData(15000, 7);

            long start = System.nanoTime();
            sorter.selectionSort(persons1);
            long finishedTime = System.nanoTime() - start;
            System.out.println(finishedTime);

            Person[] persons2 = manager.fillPersonsData(15000, 7);

            start = System.nanoTime();
            sorter.bubbleSort(persons2);
            finishedTime = System.nanoTime() - start;
            System.out.println(finishedTime);


        } catch (SamePersonException e) {
            e.printStackTrace();
        }

    }

}
