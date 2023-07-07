package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs { // https://codingbat.com/prob/p126332
    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for(String each : strings){
            map.put(each.substring(0,1), each.substring(each.length() - 1));
        }

        return map;
    }

}
