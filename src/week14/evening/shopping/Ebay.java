package week14.evening.shopping;

public final class Ebay extends OnlineShopping implements AllowUsersToSell{
    @Override
    public void uploadProduct() {
        System.out.println("you can upload your product in Ebay");
    }

    @Override
    void viewCart() {
        System.out.println("Ebay has view cart option");
    }

    @Override
    public void shipItem() {
        System.out.println("Ebay has ship item options");
    }

    @Override
    void buyItem() {
        System.out.println("yu can buy ıtem from Ebay");
    }

    @Override
    void returnItem() {
        System.out.println("You can return your item in Ebay");
    }
}
