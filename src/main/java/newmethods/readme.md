### new methods introduced in collection,Iterable,list and map interfaces in java8

**On Iterable:**
`boolean forEach(Consumer <? super E> consumer);`

**On Collection:**
`boolean removeIf(Predicate <? super E> filter);`

**On List:**
`boolean replaceAll(UnaryOperator <? super E> operator);
`

**On Map:**
`void forEach(BiConsumer<? super K,? super V> consumer)`

new version of get method,

`V getOrDefault(Object key, V defaultValue);`

new version of put method,

`V putIfAbsent(K key , V value);`

new version of replace method,

`V replace(K key,V newValue);
boolean replace(K key, V existingValue, V newValue);
void replaceAll(BiFunction<? super K,? super V,? extends V> function);
void replace(Object key, Object value);
`

new family of methods: compute*()

`V compute(K key, <BiFunction ? super K ,? super V , ? extends V> remapping);
V computeIfAbsent(K key, <Function ? super K , ? extends V> mapping);
V computeIfPresent(K key, <BifFunction ? super K ,? super V, ? extends V> remapping);`

