package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen { // https://codingbat.com/prob/p125327
    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(String each : strings){
            map.put(each, each.length());
        }

        return map;
    }

}
