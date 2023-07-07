package week12.evening.heros;

import java.util.ArrayList;

public class Marvel extends SuperHero{
    public Marvel(String heroName, String realName, ArrayList<String> powers) {
        super(heroName, realName, "Marvel", powers);
    }

    public void callAvengers(){
        System.out.println(" Calling all avengers");
    }

    @Override
    public void protect() {
        System.out.println(heroName + " is protecting in Marvel");
    }
}
