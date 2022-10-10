package newmethods;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapMethods<K, V> {

    // default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
    public V computeIfAbsent(Map<K, V> map, K key, Function<? super K, ? extends V> mappingFunction) {
        return map.computeIfAbsent(key, mappingFunction);
    }

    //default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
    public V merge(Map<K, V> map, K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return map.merge(key, value, remappingFunction);
    }
}
