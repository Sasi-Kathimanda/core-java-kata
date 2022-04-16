package hf.ooad.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void sound() {
       Animal animal = new Dog();
       assertEquals("Woof woof", animal.sound());
    }

    @Test
    void sleep() {

    }
}