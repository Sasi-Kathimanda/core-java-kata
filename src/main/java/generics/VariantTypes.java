package generics;

import java.util.List;

/**
 *  Three variant types
 *  1) Covariant - S[] is considered to be subtype of T[] whenever S is a subtype of T eg: Arrays Subtyping
 *  2) Invariant - List<S> is not considered to be subtype of List<T> except S ang T are identical. eg: Subtyping in Generics follows this
 *  3) Contravariant - List<S> is considered to be subtype of List<? extends T> when S is a super type of T
 */

public class VariantTypes {

    public void add(Integer[] ints) {
        Number[] nums = ints;
        nums[1] = 1.1; //Runtime Exception
    }

}
