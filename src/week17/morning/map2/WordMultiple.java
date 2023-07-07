package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple { // https://codingbat.com/prob/p190862
    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for(String each : strings){

            // if(map.containsKey(each)){
            //   map.put(each, true);
            // } else {
            //   map.put(each, false);
            // }

            map.put(each, map.containsKey(each));
        }
        return map;
    }

}
