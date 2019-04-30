package part01.lesson05.task01;

import part01.lesson02.task03.Person;
import part01.lesson02.task03.Sex;

public class Main {

    public static void main(String[] args) throws Exception{
        PetManager manager = new PetManager();

        Person owner00 = new Person(18, Sex.MAN, "asd");
        Pet pet00 = new Pet(356, "zxc", owner00, 10);


        Person owner0 = new Person(18, Sex.MAN, "asd");
        Pet pet0 = new Pet(21, "zxc", owner0, 15);

        Person owner1 = new Person(18, Sex.WOMAN, "qwe");
        Pet pet1 = new Pet(321, "qwe", owner1, 15);

        Person owner2 = new Person(18, Sex.MAN, "asd");
        Pet pet2 = new Pet(321, "asd", owner2, 15);

        Person owner3 = new Person(20, Sex.MAN, "rty");
        Pet pet3 = new Pet(321, "rty", owner3, 15);

        Person owner4 = new Person(20, Sex.MAN, "rty");
        Pet pet4 = new Pet(321, "rty", owner4, 15);


        //add pets
        manager.addPet(pet1);
       // manager.addPet(pet1); duplicate throws Exception
        manager.addPet(pet2);
        manager.addPet(pet0);
        manager.addPet(pet00);
        manager.addPet(pet3);

        manager.addPet(pet4);

        //search pet by nick name
        System.out.println(manager.searchPetByNickName("rty"));

        //change pet data by ID
        pet3.setNickName("qqqqqqqqqqqqqqqqqq");
        pet3.setWeight(888);
        //manager.editPetData(pet3);

        //sort pets and print
        manager.sortPets();

        for (Pet pet : manager.getPets()) {
            System.out.println(pet);
        }
    }
}
