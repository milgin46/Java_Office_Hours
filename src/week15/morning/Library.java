package week15.morning;

public class Library {
    /*
    Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call
   */

    public static void getLibraryCard(String city){

        if(city.equals("FairFax") || city.equals("McLean")){
            System.out.println("Library card created");
        } else {
            throw new NonResidentException("Library card for " + city + " is not available");
        }

    }

    /*
    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file
     */

    public static void borrow(boolean checkedOut) throws FailToCheckoutException{

        if(!checkedOut){
            throw new FailToCheckoutException("Sorry book not available");
        }

        System.out.println("Enjoy Reading");
    }


}
