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

     //duplicate key using toMap()
        System.out.println(Stream.of(1,1,1,2,3,4).collect(Collectors.toMap(k->k , v-> new ArrayList<> (Collections.singletonList(v)),
                (list1, list2) ->  { list1.addAll(list2); return list1;})));



        Map<Boolean, Set<Integer>> partitionMapComposedCollector = Stream.of(1, 9, 18, 18, 25, 32, 45, 56, 65, 72).collect(Collectors.partitioningBy(i -> i < 50, Collectors.toSet()));
        System.out.println(partitionMapComposedCollector);
    }

    //partitionBy
    protected  Map<Boolean, List<Integer>> getPartitionMap(Integer... ints) {
        return Map.of(true,List.of());
    }

    //groupBy
    protected Map<Integer, List<Integer>> getMapOfGroupBy10(Integer... ints) {
        return Stream.of(ints)
                .collect(Collectors.groupingBy(i -> i / 10 * 10));
    }

    protected Map<Integer, Integer> doubleTheValuesAndConvertToAMap(Integer... ints) {
        return Stream.of(ints).collect(Collectors.toMap(Function.identity(), i -> i * 2));
    }

    //using joining
    protected String getJoinsOfStreamOfStings(final String delimiter, final String prefix, final String suffix, final String... strings) {
        return Stream.of(strings).collect(Collectors.joining(delimiter, prefix, suffix));
    }

    //using preBuilt Collectors
    public <T> List<T> convertFromTypeToList(T... elements) {
        return Stream.of(elements).collect(Collectors.toList());
    }

    //using collectors composing

    public Map<Integer, Long> groupByMapComposedCollector(Integer... elements) {
        return Stream.of(elements).collect(Collectors.groupingBy(i -> i / 10 * 10, Collectors.counting()));
    }

    public Map<Integer, Long> groupByMapResultOrdered(Integer... elements) {
        return Stream.of(elements).collect(Collectors.groupingBy(i -> i / 10 * 10,TreeMap::new,Collectors.counting()));
    }
}
