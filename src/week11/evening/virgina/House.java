package week11.evening.virgina;

public class House {
    public String address; // you can reach everywhere
    protected  double price; // you can reach from same package and sub classes (it can be inside the different package)
    String neighborhoodName; // you can reach from same package
    private  String ownerName; // you can not reach anywhere outside of the class


    public static void main(String[] args) {
        House house=new House();
        String address1 = house.address;
        String neighborhoodName1 = house.neighborhoodName;
        String ownerName1 = house.ownerName;
        double price1 = house.price;


    }




}
