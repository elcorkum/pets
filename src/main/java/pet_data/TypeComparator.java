package pet_data;

import java.util.Comparator;

public class TypeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
    }
}
