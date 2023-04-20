package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("c", "cake");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {{
            putIfAbsent("b", "bbb");
            putIfAbsent("c", "cake");
        }};
        Map<String, String> map3 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("b", "bbb");
            putIfAbsent("c", "cake");
        }};

        System.out.println(map1.entrySet());
        mapAB3(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        mapAB3(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        mapAB3(map3);
        System.out.println(map3.entrySet());
    }


    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            return map;
        } else if (map.containsKey("a") || map.containsKey("b")) {
            if (map.get("a") != null) {
                map.put("b", map.get("a"));
            } else if (map.get("b") != null) {
                map.put("a", map.get("b"));
            }
        }
        return map;
    }

}
