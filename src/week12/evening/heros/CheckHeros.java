package week12.evening.heros;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeros {
    public static void main(String[] args) {
        Marvel spiderman=new Marvel("spider man","peter parker",new ArrayList<>(Arrays.asList("Enhanced strength",
                "agility",  "spider-sense")));

        System.out.println(spiderman);
        spiderman.protect();
        ArrayList<String> powers=new ArrayList<>(Arrays.asList("master detective", "martial arts", "technical tools"));
        DC batman=new DC("Batman","Bruce Wayne",powers,"Gothom");
        System.out.println(batman);
        System.out.println(batman.city);


    }
}
