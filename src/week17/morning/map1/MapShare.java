package week17.morning.map1;

import java.util.Map;

public class MapShare { // https://codingbat.com/prob/p148813
    public Map<String, String> mapShare(Map<String, String> map) {

        if(map.containsKey("a")){
            map.put("b", map.get("a")); // reads the value of key 'a' and stores that as the value of key 'b'
        }

        map.remove("c");

        return map;
    }

}
