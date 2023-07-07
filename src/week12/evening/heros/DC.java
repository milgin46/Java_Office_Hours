package week12.evening.heros;

import java.util.ArrayList;

public class DC extends SuperHero{
    String city;
    public DC(String heroName, String realName, ArrayList<String> powers,String city) {
        super(heroName, realName, "DC", powers);
        this.city=city;
    }
    @Override
    public void protect(){
        System.out.println(heroName +" is protecting with honor in DC");
    }

}
