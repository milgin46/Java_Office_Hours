package week14.morning.shopping;

public final class Target extends Shopping implements Shipping{
    /*    Create a concrete class Target
        - Make the class final
        - Inherit Shopping and implement Shipping
        - implement all abstract methods
    */

    @Override
    public void shipItem() {
        System.out.println("Shipping from Target warehouse");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Target store");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Target store");
    }
}
