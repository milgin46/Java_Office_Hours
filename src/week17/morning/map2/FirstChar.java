package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar { //https://codingbat.com/prob/p168493
    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for(String each : strings){

            String key = each.substring(0, 1);

            if(map.containsKey(key)){
                map.put(key, map.get(key) + each);
            } else { // if the key doesn't exist yet, this is the first time the character is found
                map.put(key, each);
            }

        }

        return map;

    }

}
