package part01.lesson02.task03;

/**
 * @author indira [19.04.2019]
 * */
public class Person implements Comparable<Person> {

    private int age;

    private Sex sex;

    private String name;

    public Person(int age, Sex sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person another) {
        int comparison = name.compareTo(another.name);
        if (comparison != 0) {
            return comparison;
        }
        return comparison;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Person anotherPerson = (Person) obj;
        return age == anotherPerson.age && sex == anotherPerson.sex && name.equals(anotherPerson.name);

    }
}
