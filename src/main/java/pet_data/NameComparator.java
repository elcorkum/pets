package pet_data;

import java.util.Comparator;

public class NameComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.getName().compareToIgnoreCase(pet2.getName());
    }
}
