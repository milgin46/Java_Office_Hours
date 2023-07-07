package week12.morning.hero;

import java.util.ArrayList;

public class DC extends SuperHero {
    /*
        Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor

    Create a class CheckHeros
    create a main method
    create Marvel and DC objects and test the variables and methods
     */

    public DC(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println("with honor");
    }
}
