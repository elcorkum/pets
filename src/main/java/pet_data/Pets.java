package pet_data;
import java.util.Scanner;
import java.util.Arrays;

public class Pets {
    public static void main(String[] args) {

        Scanner petInfo = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int numberOfPets = petInfo.nextInt();
        Pet[] pets = new Pet[numberOfPets];

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Please enter the type of pet number " + (i + 1));
            String petType = petInfo.next();
            System.out.println("Please enter the name of pet number " + (i + 1));
            String petName = petInfo.next();

           if (petType.equalsIgnoreCase("Dog")) {
               pets[i] = new Dog(petName, petType);
           } else if (petType.equalsIgnoreCase("Cat")) {
               pets[i] = new Cat(petName, petType);
           }else if (petType.equalsIgnoreCase("Fish")) {
               pets[i] = new Fish(petName, petType);
           }else if (petType.equalsIgnoreCase("Goat")) {
               pets[i] = new Goat(petName, petType);
           }else {
               pets[i] = new Pet(petName, "Unsupported type!");
           }
        }

        for(Pet pet: pets) {
            Pet.printPetInfo(pet);
            pet.speak();
        }


    }
}
