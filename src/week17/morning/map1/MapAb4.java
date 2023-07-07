package week17.morning.map1;

import java.util.Map;

public class MapAb4 { // https://codingbat.com/prob/p136950
    public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){

            String a = map.get("a");
            String b = map.get("b");

            if(a.length() > b.length()){
                map.put("c", a);
            } else if(b.length() > a.length()){
                map.put("c", b);
            } else { // length is same
                map.put("a", "");
                map.put("b", "");
            }

        }

        return map;

    }

}
