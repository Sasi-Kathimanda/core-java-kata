package concepts;


import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FailFastIterator {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                                   .collect(Collectors.toList());
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            // throws the ConcurrentModificationException after 1st iteration as it checks the initial modCount
            Integer currentVal = listIterator.next();
            System.out.println("currentVal = " + currentVal);
            list.add(6);
        }
    }
}
