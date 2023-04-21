package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("b", "bb");
            putIfAbsent("c", "cake");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {{
            putIfAbsent("a", "aa");
            putIfAbsent("b", "bbb");
            putIfAbsent("c", "cake");
        }};
        Map<String, String> map3 = new HashMap<String, String>() {{
            putIfAbsent("a", "aa");
            putIfAbsent("b", "bbb");
        }};

        System.out.println(map1.entrySet());
        mapAB4(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        mapAB4(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        mapAB4(map3);
        System.out.println(map3.entrySet());
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if ((map.get("a") != null && map.get("b") != null) && (map.get("a").length() != map.get("b").length())) {
            String longerValue = map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b");
            map.put("c", longerValue);
        } else if ((map.get("a") != null && map.get("b") != null) && (map.get("a").length() == map.get("b").length())) {
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }

}
