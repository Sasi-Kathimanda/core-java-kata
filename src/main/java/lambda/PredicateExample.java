package lambda;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        //using anonymous Predicate function
        Predicate<String> startsWithKViaAnonymous = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("K");
            }
        };

        //using lambda
        Predicate<String>   startsWithK = t -> t.startsWith("K");

        Predicate<String> endsWithA = t -> t.endsWith("a");
        System.out.println(startsWithK.and(endsWithA).test("Kathimanda"));
        System.out.println(startsWithKViaAnonymous.and(endsWithA).test("Kathimanda"));


    }
}
