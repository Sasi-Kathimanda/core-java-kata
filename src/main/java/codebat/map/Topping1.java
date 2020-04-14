package codebat.map;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<String,String>(){{ putIfAbsent("icecream","peanuts"); }};
        Map<String,String> map2 = new HashMap<String,String>(){{  }};
        Map<String,String> map3 = new HashMap<String,String>(){{ putIfAbsent("pancake","syrup");  }};

        System.out.println(map1.entrySet());
        topping1(map1);
        System.out.println(map1.entrySet());

        System.out.println("***************************");
        System.out.println(map2.entrySet());
        topping1(map2);
        System.out.println(map2.entrySet());

        System.out.println("***************************");
        System.out.println(map3.entrySet());
        topping1(map3);
        System.out.println(map3.entrySet());
    }

    public static Map<String, String> topping1(Map<String, String> map) {
     if(map.containsKey("ice cream")) {
            map.put("ice cream","cherry");
        }
     map.put("bread","butter");
     return map;
    }

}
