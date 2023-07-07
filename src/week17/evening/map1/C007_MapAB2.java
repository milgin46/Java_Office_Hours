package week17.evening.map1;

import java.util.HashMap;
import java.util.Map;

public class C007_MapAB2 {
    /*

Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //map.put("a", "aaa");
       // map.put("b", "aaa");
        map.put("c","cake");
      //  System.out.println(mapAB2(map));

        int a=1;
        if (false && a++==2){

        }
        System.out.println(a);

    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        /*
        if you are using single and & we are looking for every condition
        if you are using double && if you find one false from left to right compiler will not check the others

         */

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}
