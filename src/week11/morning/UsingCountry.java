package week11.morning;

public class UsingCountry {
    public static void main(String[] args) {

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.co2Level);
        System.out.println();
        Country.countryInfo();

        //Country.name; name is an instance variable so it cannot be accessed in a static way

        Country us = new Country("US", 350, "North America");

    }
}
