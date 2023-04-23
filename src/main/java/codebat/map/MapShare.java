package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class MapShare {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>() {{
            putIfAbsent("a", "aaa");
            putIfAbsent("b", "bbb");
            putIfAbsent("c", "ccc");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {{
            putIfAbsent("b", "xyz");
            putIfAbsent("c", "ccc");
        }};
        System.out.println(map2.entrySet());
        mapShare(map2);
        System.out.println(map2.entrySet());

    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a").length() > 0) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

}
