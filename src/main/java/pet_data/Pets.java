package pet_data;
import java.util.Scanner;
import java.util.Arrays;

public class Pets {


    public static void printPetNamesAndSounds(String petName, String petType) {
        System.out.println("Your pet " + petName + " is a " + petType);

    }


    public static void main(String[] args) {
        /*
        Create a program that asks the user how many pets they have.
        Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name.
        For now your program should just hold onto the user input and print out the list at the end; we'll modify this in part 3.
         */

        //Step 1- Create SCANNER OBJ
        //Step 2- Scan for number of pets
        //Step 3- Scan for pet type and name
        //Step 4- Store this info in two array with number of pets as array size
        //Print pet + the sound it makes as list

        Scanner petInfo = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int numberOfPets = petInfo.nextInt();
        String[] petTypes = new String[numberOfPets];
        String[] petNames = new String[numberOfPets];

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Please enter the type of pet number " + (i + 1) + " and then their name");
            petTypes[i] = petInfo.next();
            petNames[i] = petInfo.next();
        }

        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Goat myGoat = new Goat();
        Pet randomPet = new Pet();


        for (int x = 0; x < petTypes.length; x++) {
            if (petTypes[x].equalsIgnoreCase("Dog")) {
                myDog.setName(petNames[x]);
            } else if (petTypes[x].equalsIgnoreCase("Cat")) {
                myCat.setName(petNames[x]);
            } else if (petTypes[x].equalsIgnoreCase("Goat")) {
                myGoat.setName((petNames[x]));
            }
        }

        for (int z = 0; z < numberOfPets; z++) {
            printPetNamesAndSounds(petNames[z], petTypes[z]);
            if (petTypes[z].equalsIgnoreCase("Dog")) {
                Dog.speak();
            } else if (petTypes[z].equalsIgnoreCase("Cat")) {
                Cat.speak();
            } else if (petTypes[z].equalsIgnoreCase("Goat")) {
                Goat.speak();
            } else {
                Pet.speak();
            }


        }
    }
}
