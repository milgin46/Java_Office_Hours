package week17.morning.map1;

import java.util.Map;

public class MapAB2 { // https://codingbat.com/prob/p115011
    public Map<String, String> mapAB2(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }

        return map;
    }

}
