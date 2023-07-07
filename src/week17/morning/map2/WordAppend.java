package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend { // https://codingbat.com/prob/p103593
    public String wordAppend(String[] strings) {

        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for(String each : strings){

            if(!map.containsKey(each)){
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }

            if(map.get(each) % 2 == 0){
                result += each;
            }

        }

        return result;
    }

}
