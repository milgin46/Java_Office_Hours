package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 { // https://codingbat.com/prob/p152303
    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(String each : strings){
            map.put(each, 0);
        }

        return map;
    }

}
