package week17.morning.map1;

import java.util.Map;

public class MapBully { // https://codingbat.com/prob/p197888
    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")){
            String value = map.get("a");
            map.put("b", value);
            map.put("a", "");
        }

        return map;
    }

}
