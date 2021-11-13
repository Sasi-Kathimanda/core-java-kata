package concepts;

import java.util.*;
import java.util.stream.*;

public class FailFastIterator {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Integer currentVal = listIterator.next(); // throws the ConcurrentModificationException after 1st iteration as it checks the initial modCount
            System.out.println("currentVal = " + currentVal);
            list.add(6);
        }
    }
}
