package generics;

import java.util.List;

/**
 *  Three variant types
 *  1) Covariant - S[] is considered to be subtype of T[] whenever S is a subtype of T eg: Arrays Subtyping
 *  2) Invariant - List<S> is not considered to be subtype of List<T> except S ang T are identical. eg: Subtyping in Generics follows this
 *  3) Contravariant - List<S> is considered to be subtype of List<? super T> when S is a super type of T
 */

public class VariantTypes {

    public void covariantTest(Integer[] ints) {
        Number[] nums = ints;
        nums[1] = 1.1; //Runtime Exception
    }

    public void InvariantTest(List<Integer> ints) {
      //  List<Number> nums = ints; //WARNING Compiler error you cannot assign as List<Integer> is not a subtype List<Number>
         // List<Integer> ints2 = ints; //This is allows as both types are identical
    }

    public void ContraVariantTest() {

    }

}
