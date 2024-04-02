package pet_data;

public class Fish extends Pet{

    public Fish(String name, String type) {
        super(name, type);
    }

    @Override
    public void speak() {
        System.out.println("This pet says Gulp! Gulp!");
    }
}
