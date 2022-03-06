package generics;

/**
 *  Three variant types
 *  1) Covariant - List<S> is considered to be subtype of List<T> whenever S is a subtype of T eg: Arrays
 *  2) Invariant - List<S> is not considered to be subtype of List<T> except S ang T are identical. eg: Subtyping in Generics follows this
 *  3) Contravariant - List<S> is considered to be subtype of List<? extends T> when S is a super type of T
 */

public class VariantTypes {

}
