package part01.lesson05.task01;

import part01.lesson02.task03.Person;

/**
 * @author indira
 * */
public class Pet implements Comparable<Pet> {

    private int ID;
    private String nickName;
    private Person owner;
    private int weight;

    public Pet(int ID, String nickName, Person owner, int weight) {
        this.ID = ID;
        this.nickName = nickName;
        this.owner = owner;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pet another) {
        int comparison = owner.compareTo(another.owner);
        if (comparison != 0) {
            return comparison;
        }
        comparison = nickName.compareTo(another.nickName);
        if (comparison != 0) {
            return comparison;
        }
        return weight == another.weight ? 0 : (weight < another.weight ? -1 : 1);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickName='" + nickName + '\'' +
                ", owner=" + owner +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Pet anotherPet = (Pet) object;
        return ID == anotherPet.getID() && nickName.equals(anotherPet.getNickName())
                && owner.equals(anotherPet.owner) && weight == anotherPet.weight;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
