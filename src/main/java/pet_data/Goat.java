package pet_data;

public class Goat extends Pet{

    public Goat(String name, String type) {
        super(name, type);
    }

    @Override
    public void speak() {
        System.out.println("This pet says Baa! Baa!");
    }
}
