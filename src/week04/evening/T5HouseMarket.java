package week04.evening;

public class T5HouseMarket {


    public static void main(String[] args) {
//define a $neighborhood_name
          // word1_word2 : snake case
          //word1-word2 : kebap case
        //word1Word2 : camelCase

String neighborhoodName="Highland";

double avgPrice=0.0;
double rating=0.0;
boolean isGated=false;
boolean isAllowedPets=false;

switch (neighborhoodName){
    case "Hills":
        avgPrice=89_000;
        rating=4.0;
        isGated=false;
        isAllowedPets=true;
        break;
    case "Oaks":
        avgPrice=75_000;
        rating=3.5;
        isGated=false;
        isAllowedPets=true;
        break;
    case "Highland":
        avgPrice=150_000;
        rating=4.5;
        isGated=true;
        isAllowedPets=false;
        break;
    case "Canyon":
        avgPrice=201_000;
        rating=4.8;
        isGated=true;
        isAllowedPets=true;
        break;

}
String isGatedValue=isGated? "is gated" :"is not gated";
String isAllowedPetsValue=isAllowedPets? "allowed" : "not allowed";
String isAllowedPetsLucky=isAllowedPets? "are" : "are not";


String report=
        "the houses in the "+neighborhoodName+" on average value at "+avgPrice+". This neighborhood "+isGatedValue+
                " and the rating of the school distracts near by is " +rating +" out of 5. For the pet owners you " +isAllowedPetsLucky + " in luck because pets are " +isAllowedPetsValue;

        System.out.println(report);


    }
}
