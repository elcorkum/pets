package pet_data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetShould {

    private String name;
    private String type;

    @Test
    @DisplayName("setNameCorrectly")
    public void testSetName(){
        name = "geo";
        Pet p = new Fish();
        p.setName(name);
        assertEquals(name, p.getName());
    }
    @Test
    @DisplayName("setTypeCorrectly")
    public void testSetType(){
        type = "dog";
        Pet p = new Goat();
        p.setType(type);
        assertEquals(type, p.getType());

    }
    @Test
    @DisplayName("setParametersCorrectlyUsingParameterizedConstructor")
    public void testParameterizedConstructor(){
        name = "Leo";
        type = "Cat";
        Pet p = new Cat(name, type);
        assertEquals(name, p.getName());
        assertEquals(type, p.getType());
    }

    @Test
    @DisplayName("ensurePetIsOfCorrectInstance")
    public void testInstanceOfPet(){
        Pet p = new Dog();
        Pet w = new Goat();
        Pet h = new Fish();
        Pet q = new Cat();

        assertInstanceOf(Dog.class, p);
        assertInstanceOf(Goat.class, w);
        assertInstanceOf(Fish.class, h);
        assertInstanceOf(Cat.class, q);

    }

}