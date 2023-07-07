package week15.morning;

public class FailToCheckoutException extends Exception {
    /*
     Create a class FailToCheckOutException
    make this a checked exception

    create a constructor to accept the String argument and pass it to the super constructor
     */

    public FailToCheckoutException(String message) {
        super(message);
    }
}
