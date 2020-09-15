package streams.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * two types of collect:
 * <R,A> R collect(Collector<? super T,A,R> collector)
 * <R> R collect(Supplier<R> supplier,
 *               BiConsumer<R,? super T> accumulator,
 *               BiConsumer<R,R> combiner)
 */
public class StreamsCollect {
    public static void main(String[] args) {
    // convert to stream to list using custom collector

        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(() -> new ArrayList<>(),
                        (l, i) -> l.add(i),
                        (l1, l2) -> l1.addAll(l2));

    // replace above with method reference
        list =  Stream.of(1, 2, 3, 4, 5)
                .collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);

     //using preBuilt Collectors
     list =  Stream.of(1,2,3,4,5,1).collect(Collectors.toList());
    }
}
