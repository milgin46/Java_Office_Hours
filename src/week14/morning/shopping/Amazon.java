package week14.morning.shopping;

public final class Amazon extends OnlineShopping{
    /*
        Create a concrete class Amazon
        - Make the class final
        - Inherit OnlineShopping and implement all abstract methods
     */

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping from Amazon warehouse");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Amazon");
    }
}
