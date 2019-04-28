package part01.lesson02.task03;

import java.util.Random;

/**
 * @author indira
 * */
public class PersonManager {

    public static final String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

    /**
     * method fill array of Persons
     * @param size size of Persons array
     * @param nameSize size of Person's name
     * @return array of Persons
     * */
    public Person[] fillPersonsData(int size, int nameSize){
        Person[] persons = new Person[size];

        for (int i = 0; i < size; i++) {

            //generate age
            Random rand = new Random();
            int age = rand.nextInt(100);

            //generate sex
            Sex sex = Sex.values()[new Random().nextInt(2)];

            //generate name
            String name = generateName(nameSize);

            persons[i] = new Person(age, sex, name);
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
        StringBuilder name = new StringBuilder(nameSize);

        for (int i = 0; i < nameSize; i++) {
            int index  = (int)(AlphaNumericString.length() * Math.random());
            name.append(AlphaNumericString.charAt(index));
        }
        return name.toString();
    }

}
