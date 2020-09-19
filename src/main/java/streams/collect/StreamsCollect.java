package streams.collect;

import java.util.*;
import java.util.function.Function;
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

     //using joining
        System.out.println(Stream.of("this","is","a","string").collect(Collectors.joining("|","PRE","")));

     //using toMap()
        Map<Integer, Integer> map = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toMap(Function.identity(), i -> i * 2));
        System.out.println(map);

     //duplicate key using toMap()
        System.out.println(Stream.of(1,1,1,2,3,4).collect(Collectors.toMap(k->k , v-> new ArrayList<> (Collections.singletonList(v)),
                (list1, list2) ->  { list1.addAll(list2); return list1;})));
     // using foreach

     //groupBy
        Map<Integer, List<Integer>> groupByMap = Stream.of(2, 18, 25, 36, 35, 51, 54, 62, 68, 72, 78, 85).collect(Collectors.groupingBy(i -> i / 10 * 10));
        System.out.println(groupByMap);

        Map<Integer, Long> groupByMapComposedCollector = Stream.of(2, 18, 25, 36, 35, 51, 54, 62, 68, 72, 78, 85).collect(Collectors.groupingBy(i -> i / 10 * 10, Collectors.counting()));
        System.out.println(groupByMapComposedCollector);

        Map<Integer, Long> groupByMapResultOrdered = Stream.of(2, 18, 25, 36, 35, 51, 54, 62, 68, 72, 78, 85).collect(Collectors.groupingBy(i -> i / 10 * 10, TreeMap::new, Collectors.counting()));
        System.out.println(groupByMapResultOrdered);

     //partitionBy
    }
}
