package week17.morning.map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount { // https://codingbat.com/prob/p117630
    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> counter = new HashMap<>(); // key = element, value = count/freq

        for(String each : strings){

            if(!counter.containsKey(each)){ // this is the first the value is checked
                counter.put(each, 0);
            }

            counter.put(each, counter.get(each) + 1);

        }

        return counter;
    }
/*
[a, b, a, a, c, d]
            *
counter{
  a = 3
  b = 1
  c = 1
  d = 1
}


*/
}
