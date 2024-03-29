package generics.world;

import domain.Person;
import java.util.Comparator;

/** Implementing a Generic Type.
 * @param <T>  T is a Type
 */
public class SortedByAgeComparator<T> implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
