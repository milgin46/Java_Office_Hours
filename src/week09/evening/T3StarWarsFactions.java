package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class T3StarWarsFactions {
    /*

T3StarWarsFactions [ArrayList, String, Loop]

    Create a program that defines an ArrayList with names. Go through the names and separate them into separate ArrayLists based on the faction they belong to. Print all the factions at the end

        The factions can be determined by key titles in the names
        ignore case sensitivity

        titles - & - related factions

        jedi - jedi order
        imperial, trooper, or officer - galactic empire
        rebel, or alliance - rebel alliance

    Sample data: Add more data if you want

        "Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"

     */

    public static void main(String[] args) {
        ArrayList<String> input=new ArrayList<>(Arrays.asList("Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"));

        ArrayList<String> jedi_order=new ArrayList<>();
        ArrayList<String> galactic_empire=new ArrayList<>();
        ArrayList<String> rebel_alliance=new ArrayList<>();

        //I need to get each element
        for (String each : input) {

            String temp=each.toLowerCase();

            //if element is containing jedi
            if (temp.contains("jedi")){
                //I will put that element inside jedi_order list
                jedi_order.add(each);
            }


            //if eleemnt is contaning imperial, trooper, or officer
            if (temp.contains("imperial")||temp.contains("trooper")||temp.contains("officer")) {

                // I will put that elements inside the galactic_empire list
                galactic_empire.add(each);
            }

            // if element is containing rebel, or alliance
            if (temp.contains("rebel") || temp.contains("alliance")) {

                // I will put that elements inside the rebel_alliance list
                rebel_alliance.add(each);
            }


        }

        System.out.println("jedi_order = " + jedi_order);
        System.out.println("galactic_empire = " + galactic_empire);
        System.out.println("rebel_alliance = " + rebel_alliance);


    }
}
