package part01.lesson05.task01;

import part01.lesson02.task03.Person;

/**
 * @author indira
 * */
public class Animal {

    private int ID;
    private String nickName;
    private Person owner;

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
}
