package week12.evening.heros;

import java.util.ArrayList;

public class SuperHero {
    String heroName;
    String realName;
    String universe;
    ArrayList<String> powers;

    public SuperHero(String heroName, String realName, String universe, ArrayList<String> powers) {
        this.heroName = heroName;
        this.realName = realName;
        this.universe = universe;
        //this.powers = new ArrayList<>(powers); // we are creating a new arraylist and copying our values in it.
        this.powers=powers; // we are pointing arraylist which is created before
    }

    public  void protect(){
        System.out.println(heroName + " is protecting");
    }

    @Override
    public String toString() {
        return "Hero Name : " + heroName+
                "\nReal Name : " +realName+
                "\nPowers : " + powers;
    }
}
