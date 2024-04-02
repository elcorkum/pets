package pet_data;

public class Dog extends Pet{

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void speak() {
        System.out.println("This pet says Woof! Woof!");
    }
}
