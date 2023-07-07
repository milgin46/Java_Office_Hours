package week14.morning.shopping;

public interface Shipping {
    /*
        Create an interface Shipping
        - Declare an abstract methods:
            shipItem()
     */

    // variables will be public static final

    void shipItem(); // public abstract

    default void notification(){
        System.out.println("Sending email: Package Shipped");
    }

}
