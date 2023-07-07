package week17.morning.map1;

import java.util.Map;

public class MapAB { // https://codingbat.com/prob/p107259
    public Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){
            String value = map.get("a") + map.get("b");
            map.put("ab", value);
            // map.put("ab", map.get("a") + map.get("b"))
        }

        return map;
    }

}
