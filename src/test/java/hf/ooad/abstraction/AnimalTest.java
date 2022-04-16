package hf.ooad.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void sound() {
        Animal animal = new Dog();
        assertEquals("Woof woof", animal.sound());

        animal = new Cat();
        assertEquals("Meow meow", animal.sound());
    }

    @Test
    void sleep() {
        Animal animal = new Dog();
        assertEquals("Zzzz", animal.sleep());
    }
}