package part01.lesson02.task03;

/**
 * @author indira [19.04.2019]
 * */
public class Person {

    private int age;

    private Sex sex;

    private String name;

    //region Constructors
    public Person() {
    }

    public Person(int age, Sex sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
    //endregion

    //region getters & setters
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
    //endregion
}
