package week17.evening.map1;

import java.util.HashMap;
import java.util.Map;

public class C001_MapBully {
/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("a","candy");
        map.put("b","dirty");


        System.out.println(map);

    }

    public static Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")){
            //I need to get the value of a key
            String valueOfA = map.get("a");
            //I need to change value of b
            map.put("b",valueOfA);
            //I need to change value of a
            map.put("a","");
        }
        return map;
    }

}
