package java11tojava17.sealed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SealedAnimalTest {

    @Test
    void soundAndSleepFromAnimalsAreOk() {
        SealedAnimal sealedCat = new SealedCat();
        assertEquals("meow meow pilli", sealedCat.sound());
        assertEquals("Zzz", sealedCat.sleep());
        assertTrue(sealedCat.getClass().isSealed());

        SealedAnimal nonSealedDog = new NonSealedDog();
        assertEquals("bow bow kukka", nonSealedDog.sound());
        assertEquals("Zzz", nonSealedDog.sleep());
        assertFalse(sealedCat.getClass().isSealed());

    }

}