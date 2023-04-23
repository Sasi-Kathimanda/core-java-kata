package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class MapBully {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>() {{
            putIfAbsent("a", "candy");
            putIfAbsent("b", "dirt");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {{
            putIfAbsent("a", "candy");
        }};
        Map<String, String> map3 = new HashMap<String, String>() {{
            putIfAbsent("a", "candy");
            putIfAbsent("b", "carrot");
            putIfAbsent("c", "meh");
        }};

        System.out.println(map3.entrySet());
        mapBully(map3);
        System.out.println(map3.entrySet());

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
            return map;
        }
        return map;
    }

//    public static Map<String, String> mapBullyJ8(Map<String, String> map) {
//        map.compute("a", key-> new HashMap<String,String>().put("b",map.get("a")));
//        return map;
//    }
}