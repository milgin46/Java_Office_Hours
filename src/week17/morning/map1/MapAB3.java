package week17.morning.map1;

import java.util.Map;

public class MapAB3 { // https://codingbat.com/prob/p115012
    public Map<String, String> mapAB3(Map<String, String> map) {

        if(map.containsKey("a") && !map.containsKey("b")){ // checks for a, no b
            map.put("b", map.get("a"));
        } else if(!map.containsKey("a") && map.containsKey("b")){ // checks for b, no a
            map.put("a", map.get("b"));
        }

        return map;
    }

}
