package pet_data;

public abstract class Pet implements Comparable<Pet>{
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


     public Pet(){}

    public void speak() {
        System.out.println("This pet can make a sound!");
    }

    @Override
    public String toString() {
        return "Pet name: " + name + '\'' +
                ", Pet type: " + type + '\'';
    }

    public static void printPetInfo(Pet pet) {
        System.out.println(pet);
    }


    @Override
    public int compareTo(Pet pet) {
         if(this.getName().equalsIgnoreCase(pet.getName())){
           return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
         }else
            return this.getName().compareTo(pet.getName());
    }
}
