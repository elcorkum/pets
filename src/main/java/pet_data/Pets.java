package pet_data;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Pets {
    public static void main(String[] args) {

        Scanner petInfo = new Scanner(System.in);

        int numberOfPets = 0;
        Pet[] pets = new Pet[0];
        int x = 1;
        while(x==1){
            try {
                System.out.println("How many pets do you have");
                numberOfPets = petInfo.nextInt();
                pets = new Pet[numberOfPets];
                x++;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number:");
                petInfo.nextLine();
            }
        }

        try {
            for (int i = 0; i < numberOfPets; i++) {
                System.out.println("Enter the type of pet number " + (i + 1) + " (Dog/Cat/Fish/Goat):");
                String petType = petInfo.next();
                System.out.println("Enter the name of pet number " + (i + 1));
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
                   System.out.println("Unsupported pet! Please enter one of the following: dog/cat/fish/goat");
                   i--;
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(Pet pet: pets) {
            Pet.printPetInfo(pet);
            pet.speak();
        }

        Arrays.sort(pets);
        for(Pet pet: pets) {
            Pet.printPetInfo(pet);
        }
        TypeComparator typeComparator = new TypeComparator();
        NameComparator comp = new NameComparator();

        Arrays.sort(pets, typeComparator.thenComparing(comp));
        for(Pet pet: pets) {
            Pet.printPetInfo(pet);
        }




    }
}
