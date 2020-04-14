package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<String,String>(){{ putIfAbsent("a","Hi");putIfAbsent("b","There"); }};
        Map<String,String>  map2 = new HashMap<String,String>(){{ putIfAbsent("a","Hi"); }};
        Map<String,String>  map3 = new HashMap<String,String>(){{ putIfAbsent("b","There"); }};

        System.out.println(map1.entrySet());
        mapAB(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        mapAB(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        mapAB(map3);
        System.out.println(map3.entrySet());

    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }

}
