package concepts;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FailSafeIterator {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Integer currentValue = listIterator.next();
            System.out.println("currentValue = " + currentValue);
            list.add(6);
        }
        System.out.println(list);
    }
}
