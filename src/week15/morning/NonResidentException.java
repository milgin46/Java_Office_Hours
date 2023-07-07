package week15.morning;

public class NonResidentException extends RuntimeException{
    /*
    Create a class NonResidentException
    make this a unchecked exception

    create a constructor to accept the String argument and pass it to the super constructor
     */

    public NonResidentException(String msg){
        super(msg);
    }

}
