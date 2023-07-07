package week12.morning.hero;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeroes {
    public static void main(String[] args) {

        Marvel spiderman = new Marvel("Spider Man", "Peter Parker",
                new ArrayList<>(Arrays.asList("Enhanced strength", "agility", "spider-sense")));

        ArrayList<String> tonyPowers = new ArrayList(Arrays.asList("powered suit of armor", "flight", "enhanced strength"));

        Marvel ironman = new Marvel("Iron Man", "Tony Stark", tonyPowers);

        System.out.println(spiderman);
        System.out.println(ironman);
        spiderman.callAvengers();
        ironman.callAvengers();

        spiderman.protect();

        //spiderman.superHeroName; the superHeroName is private, so it is not inherited
        System.out.println(spiderman.getSuperHeroName());
        System.out.println(spiderman.getRealName());

        spiderman.setUniverse("Multiverse");
        System.out.println(spiderman);

        DC batman = new DC("Batman", "Bruce Wayne", new ArrayList<>(Arrays.asList("master detective", "martial arts", "technical tools")));
        System.out.println(batman);

    }
}
