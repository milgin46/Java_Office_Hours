package week14.morning.shopping;

public class WareHouse {
    public static void main(String[] args) {

        Shopping[] allShops = {
                new Amazon(),
                new Ebay(),
                new Target(),
                new Target(),
                new Amazon()
        };

        for(Shopping each : allShops){
            each.buyItem();
        }

        System.out.println();

        for(Shopping each : allShops){
            if(each instanceof OnlineShopping){
                ((OnlineShopping)each).viewCart();
            }
        }

        Amazon obj = new Amazon();
        obj.viewCart();


    }
}
