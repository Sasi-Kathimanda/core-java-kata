package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class Topping3 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<String,String>(){{ putIfAbsent("potato","ketchup"); }};
        Map<String,String> map2 = new HashMap<String,String>(){{ putIfAbsent("potato","butter"); }};
        Map<String,String> map3 = new HashMap<String,String>(){{ putIfAbsent("salad","oil");putIfAbsent("potato","ketchup");}};

        System.out.println(map1.entrySet());
        topping3(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        topping3(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        topping3(map3);
        System.out.println(map3.entrySet());
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato") && map.get("potato").length() > 0) {
            map.put("fries",map.get("potato"));
        }
        if (map.containsKey("salad") && map.get("salad").length() > 0) {
            map.put("spinach",map.get("salad"));
        }
        return map;
    }
}
