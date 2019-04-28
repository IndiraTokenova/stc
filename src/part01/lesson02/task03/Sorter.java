package part01.lesson02.task03;

/**
 * class contains two method to sort array
 *
 * @author indira [19.04.2019]
 * */
public interface Sorter {

    /**
     * Method sorts array of persons by bubble sort algorithm
     *
     * @param persons array
     * */
    void bubbleSort(Person[] persons) throws SamePersonException;

    /**
     * Method sorts array of persons by quick sort algorithm
     *
     * @param persons array
     */
    void selectionSort(Person[] persons) throws SamePersonException;

}
