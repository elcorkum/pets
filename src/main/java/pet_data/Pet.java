package pet_data;

public class Pet {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public static void speak() {
        System.out.println("This pet can talk");
    }


}


class Dog extends Pet {
    public static void speak() {
        System.out.println("This pet says woof! woof!");
    }
}

class Cat extends Pet {

    public static void speak() {
        System.out.println("This says meow! meow!");
    }
}
class Goat extends Pet {
    public static void speak() {
        System.out.println("This says baa! baa!");
    }
}

