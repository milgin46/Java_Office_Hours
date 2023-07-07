package week09.morning;

import utils.StringUtils;

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

        ArrayList<String> data = new ArrayList<>(Arrays.asList("Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"));
        ArrayList<String> jediOrder = new ArrayList<>();
        ArrayList<String> galacticEmpire = new ArrayList<>();
        ArrayList<String> rebelAlliance = new ArrayList<>();

        // version 3: removed the faction name and capitalized the name
        for (String name : data) {
            name = name.toLowerCase();

            if (name.contains("jedi")) {
                jediOrder.add(StringUtils.capitalize(name.replace("jedi", "").trim()));
            } else if (name.contains("imperial") || name.contains("trooper") || name.contains("officer")) {
                galacticEmpire.add(StringUtils.capitalize(name.replace("imperial", "").replace("trooper", "").replace("officer", "").trim()));
            } else if (name.contains("rebel") || name.contains("alliance")) {
                rebelAlliance.add(StringUtils.capitalize(name.replace("rebel", "").replace("alliance", "").trim()));
            }

        }

        System.out.println("Data: " + data);
        System.out.println("Jedi: " + jediOrder);
        System.out.println("Galactic Empire: " + galacticEmpire);
        System.out.println("Rebel Alliance: " + rebelAlliance);


    }

/*  original task with removeIf
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>(Arrays.asList( "Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"));
        ArrayList<String> jediOrder = new ArrayList<>(data);
        ArrayList<String> galacticEmpire = new ArrayList<>(data);
        ArrayList<String> rebelAlliance = new ArrayList<>(data);

        jediOrder.removeIf(p -> !p.toLowerCase().contains("jedi"));
        galacticEmpire.removeIf(p -> !p.toLowerCase().contains("imperial") &&  !p.toLowerCase().contains("trooper") && !p.toLowerCase().contains("officer")); // there is a better way to write this but this is how we have learned for now
        rebelAlliance.removeIf(p -> !p.toLowerCase().contains("rebel") &&  !p.toLowerCase().contains("alliance"));

        System.out.println("Data: " + data);
        System.out.println("Jedi: " + jediOrder);
        System.out.println("Galactic Empire: " + galacticEmpire);
        System.out.println("Rebel Alliance: " + rebelAlliance);
    }
*/


}

/*      version 1 : original task
        for(String name : data){
            name = name.toLowerCase();

            if(name.contains("jedi")){
                jediOrder.add(name);
            } else if(name.contains("imperial") || name.contains("trooper") || name.contains("officer")){
                galacticEmpire.add(name);
            } else if(name.contains("rebel") || name.contains("alliance")){
                rebelAlliance.add(name));
            }

        }
 */

/*      version 2: removed the title/faction from name
        for(String name : data){
            name = name.toLowerCase();

            if(name.contains("jedi")){
                jediOrder.add(name.replace("jedi", "").trim());
            } else if(name.contains("imperial") || name.contains("trooper") || name.contains("officer")){
                galacticEmpire.add(name.replace("imperial", "").replace("trooper", "").replace("officer", "").trim());
            } else if(name.contains("rebel") || name.contains("alliance")){
                rebelAlliance.add(name.replace("rebel", "").replace("alliance", "").trim());
            }

        }
 */

