package newmethods;

import java.util.HashMap;
import java.util.Map;
import lambda.Person;

public class MapMethods {

    public static void main(String[] args) {
        Map<String, Map<String, Person>> map = new HashMap<String, Map<String, Person>>() { {
            putIfAbsent("one", new HashMap<String, Person>() {{
                 putIfAbsent("one",new Person("sasi",19));
                }});
        }
        };
        printMap(map);
        Person computedMap = map.computeIfAbsent(
            "one", key -> new HashMap<String, Person>()
                                                ).put("two", new Person("Dan", 29));
        System.out.println("computedMap="+computedMap);
        printMap(map);

    }

    private static void printMap(Map<String, Map<String, Person>> map) {
        System.out.println("--------------------------------------------------------------------------");
        map.forEach( (k,v) -> {
            System.out.println("key="+ k +":value=" +v.entrySet() );
        });
        System.out.println("--------------------------------------------------------------------------");
    }
}
