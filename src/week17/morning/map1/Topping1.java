package week17.morning.map1;

import java.util.Map;

public class Topping1 { // https://codingbat.com/prob/p182712
    public Map<String, String> topping1(Map<String, String> map) {

        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");

        return map;

    }

}
