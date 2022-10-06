package newmethods;

import java.util.Map;
import java.util.function.Function;

public class MapMethods<K, V> {

    // default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
    public V computeIfAbsent(Map<K, V> map, K key, Function<? super K, ? extends V> mappingFunction) {

        return map.computeIfAbsent(key, mappingFunction);
    }

}
