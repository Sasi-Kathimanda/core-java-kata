package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>() {{
            putIfAbsent("ice cream", "cherry");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {
            {
                putIfAbsent("spinach", "dirt");
                putIfAbsent("ice cream", "cherry");
            }
        };
        Map<String, String> map3 = new HashMap<String, String>() {{
            putIfAbsent("yogurt", "salt");
        }};

        System.out.println(map1.entrySet());
        topping2(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        topping2(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        topping2(map3);
        System.out.println(map3.entrySet());
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

}
