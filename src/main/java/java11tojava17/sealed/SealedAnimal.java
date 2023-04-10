package java11tojava17.sealed;

public abstract sealed class SealedAnimal permits SealedCat, NonSealedDog {
    abstract String sound();

    String sleep() {
        return "Zzz";
    }
}

final class SealedCat extends SealedAnimal {

    @Override
    String sound() {
        return "meow meow pilli";
    }
}

non-sealed class NonSealedDog extends SealedAnimal {

    @Override
    String sound() {
        return "bow bow kukka";
    }
}

