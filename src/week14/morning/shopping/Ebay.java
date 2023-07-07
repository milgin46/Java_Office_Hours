package week14.morning.shopping;

public final class Ebay extends OnlineShopping implements AllowUsersToSell {
    /*
        Create a concrete class EBay
        - Make the class final
        - Inherit OnlineShopping and implements interface AllowUsersToSell interface
        - Implement all abstract methods
     */

    @Override
    public void uploadProduct() {
        System.out.println("Upload product to Ebay");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing cart on Ebay");
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping to user");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Ebay user");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Ebay user");
    }
}
