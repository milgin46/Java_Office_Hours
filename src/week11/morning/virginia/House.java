package week11.morning.virginia;

// main class, also testing same class access
public class House {

    public String address;
    protected double price;
    String neighborhoodName;
    private String ownerName;

    public static void main(String[] args) {
        House obj = new House();
        obj.address = "1000 N lane";
        obj.price = 100_000;
        obj.neighborhoodName = "Berry Hills";
        obj.ownerName = "James Bond";
    }
}
