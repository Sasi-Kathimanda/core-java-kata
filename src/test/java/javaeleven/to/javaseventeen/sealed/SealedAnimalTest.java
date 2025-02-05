package javaeleven.to.javaseventeen.sealed;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SealedAnimalTest {

    @Test
    void soundAndSleepFromAnimalsAreOk() {
        SealedAnimal sealedCat = new SealedCat();
        assertEquals("meow meow pilli", sealedCat.sound());
        assertEquals("Zzz", sealedCat.sleep());
        assertFalse(sealedCat.getClass().isSealed());
        assertTrue(Arrays.stream(sealedCat.getClass().getSuperclass().getPermittedSubclasses())
                .anyMatch(permittedClass -> Objects.equals(permittedClass.getCanonicalName(), sealedCat.getClass().getCanonicalName())));

        SealedAnimal nonSealedDog = new NonSealedDog();
        assertEquals("bow bow kukka", nonSealedDog.sound());
        assertEquals("Zzz", nonSealedDog.sleep());
        assertFalse(nonSealedDog.getClass().isSealed());

    }

}