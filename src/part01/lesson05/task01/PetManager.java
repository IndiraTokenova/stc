package part01.lesson05.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetManager {

    private List<Pet> pets = new ArrayList<>();

    /**
     * method adds pet to set pets
     * @param pet
     * */
    public void addPet(Pet pet) throws Exception {
        if (pets.size() == 0) {
            pets.add(pet);
        } else {
            for (Pet petFromList : pets) {
                if (petFromList.equals(pet)) {
                    throw new Exception();
                } else {
                    pets.add(pet);
                }
            }
        }
    }

    /**
     * method search pet by nickName
     * @param nickName name of Pet
     * @return searched Pet
     * */
    public Pet searchPetByNickName(String nickName) {
        for (Pet pet : pets) {
            if (pet.getNickName().equals(nickName)) {
                return pet;
            }
        }
        return null;
    }

    /**
     * method change pet data by pet ID
     * @param newPet another Pet with new data
     * */
    public void editPetData(Pet newPet) {
        for (Pet pet : pets) {
            if (pet.getID() == newPet.getID()) {
                pet = newPet;
            }
        }
    }

    /**
     * method sorts pets list
     * */
    public void sortPets() {
        Collections.sort(pets);
    }

    /**
     * method gets list of pets
     * */
    public List<Pet> getPets() {
        return pets;
    }
}
