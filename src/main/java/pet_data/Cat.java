package pet_data;

public class Cat extends Pet{
    public Cat(String name, String type) {
        super(name, type);
    }
    public Cat(){}

    @Override
    public void speak() {
        System.out.println("This pet says Meow! Meow!");
    }
}
