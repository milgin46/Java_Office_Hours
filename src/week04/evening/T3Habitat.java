package week04.evening;

public class T3Habitat {


    public static void main(String[] args) {

        //will define a String variable of the habitat you want information on
        String habitat="jungle";

        //I need to define another variable for animals in habitats
        String animals="";

        switch (habitat){

            case "grasslands":
                animals="goats, bison, badgers, coyotes";
                break;
            case "jungle"    :
                animals="snakes, tigers, gorillas, rhinos, toucans";
                break;
            case "city":
                animals="dogs, cats, gulls, squirrels";
                break;

            case "safari":
                animals="lion, hippo, giraffe, zebras, elephants";
                break;
            default:
                System.out.println("invalid habitat name");

        }
/*
if (animals==""){
    System.out.println("Wrong input");

}else {
    System.out.println("In the "+habitat+" you will be able to find: " +animals);
}


 */







        System.out.println("In the "+habitat+" you will be able to find: " +animals);



    }







}
