package part01.lesson02.task03;

import java.util.Random;

public class PersonManager {

    /**
     * method fill array of Persons
     *
     * @param size size of array
     * @return array of Persons
     * */
    public Person[] fillPersonsData(int size, int nameSize){
        Person[] persons = new Person[size];
        for (int i = 0; i < size; i++) {

            //generate age
            Random rand = new Random();
            int age = rand.nextInt(100);

            persons[i] = new Person(age, Sex.getSex(rand.nextBoolean()), generateName(nameSize));
        }

        return persons;
    }

    /**
     * method generate Person name with a-z letters
     *
     * @param nameSize size of name
     * @return generated name
     * */
    private String generateName(int nameSize) {

        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        StringBuilder name = new StringBuilder(nameSize);

        for (int j = 0; j < nameSize; j++) {

            int index  = (int)(AlphaNumericString.length()  * Math.random());

            name.append(AlphaNumericString.charAt(index));
        }
        return name.toString();
    }

}
