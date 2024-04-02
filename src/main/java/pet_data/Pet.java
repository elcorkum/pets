package pet_data;

public class Pet {
    private String name;
    private String type;
     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return this.name;
     }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet(String name, String type) {
         this.name = name;
         this.type = type;
     }

    public void speak() {
        System.out.println("This pet can make a sound!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void printPetInfo(Pet pet) {
        System.out.println(pet);
    }

//    public void printPetNamesAndSounds(Pet[] pets) {
//         for(Pet[] pet : pets)
//         { System.out.println();}
//
//
//    }

}
