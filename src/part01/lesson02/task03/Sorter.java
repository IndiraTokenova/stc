package part01.lesson02.task03;

/**
 * @author indira [19.04.2019]
 * */
public class Sorter implements SorterIF {

    @Override
    public void bubbleSort(Person[] persons) throws SamePersonException {

        for (int i = persons.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (persons[j].getSex().equals(Sex.WOMAN) && persons[j + 1].getSex().equals(Sex.MAN)) {     //sort by sex
                    swapElements(persons, j, j + 1);
                } else if (persons[j].getSex().equals(persons[j + 1].getSex())) {
                    if (persons[j].getAge() < persons[j+ 1].getAge()) {     //sort by age
                        swapElements(persons, j, j + 1);
                    } else if (persons[j].getAge() == persons[j+ 1].getAge()) {
                        if (persons[j].getName().compareTo(persons[j + 1].getName()) > 0) {     //sort by name
                            swapElements(persons, j, j + 1);
                        } else if (persons[j].getName().compareTo(persons[j + 1].getName()) == 0) {
                            throw new SamePersonException(persons[j].getName(), persons[j].getAge());
                        }
                    }
                }
            }
        }
    }

    @Override
    public void selectionSort(Person[] persons) throws SamePersonException {

        for (int left = 0; left < persons.length; left++) {
            int minInd = left;
            for (int i = left; i < persons.length; i++) {
                if (persons[i].getSex().equals(Sex.MAN) && persons[minInd].getSex().equals(Sex.WOMAN)) {      //sort by sex
                    minInd = i;
                } else if (persons[i].getSex().equals(persons[minInd].getSex())) {
                    if (persons[i].getAge() > persons[minInd].getAge()) {    //sort by age
                        minInd = i;
                    } else if (persons[i].getAge() == persons[minInd].getAge()) {
                        if (persons[i].getName().compareTo(persons[minInd].getName()) < 0) {     //sort by name
                            minInd = i;
                        } else if (persons[i].getName().compareTo(persons[minInd].getName()) == 0) {
                           // throw new SamePersonException(persons[i].getName(), persons[i].getAge()); TODO
                        }
                    }
                }
            }
            swapElements(persons, left, minInd);
        }
    }


    /**
     * method change element places
     *
     * @param persons array of Person
     * @param first element id
     * @param second element id
     * */
    private void swapElements(Person persons[], int first, int second){
        Person person = persons[first];
        persons[first] = persons[second];
        persons[second] = person;
    }

}

