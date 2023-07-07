package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap { // https://codingbat.com/prob/p134133
    public String[] allSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>(); // key = first char, value = index

        for(int i = 0; i < strings.length; i++){
            char key = strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key, i);
            } else {
                int oldIndex = map.get(key);
                String temp = strings[oldIndex]; // cx
                strings[oldIndex] = strings[i];
                strings[i] = temp;
                map.remove(key);
            }


        }

        return strings;

    }
/*
"ay", "by", "cy", "cx", "bx", "ax",

Map{
  a = 0


}

*/

}
