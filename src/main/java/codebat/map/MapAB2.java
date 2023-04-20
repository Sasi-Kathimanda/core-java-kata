package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("b", "aaa");
            putIfAbsent("c", "cake");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("b", "bbb");
        }};
        Map<String, String> map3 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("b", "bb");
            putIfAbsent("c", "aaa");
        }};

        System.out.println(map1.entrySet());
        mapAB2(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        mapAB2(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        mapAB2(map3);
        System.out.println(map3.entrySet());
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if ((map.containsKey("a") && map.containsKey("b") && (map.get("a").equals(map.get("b"))))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
