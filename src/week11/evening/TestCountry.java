package week11.evening;

public class TestCountry {

    public static void main(String[] args) {
        System.out.println(Country.co2Level);
        Country USA=new Country("USA",0.45,"NA");
        System.out.println(USA);
        Country CA=new Country("Canada",0.038,"NA");
        System.out.println(CA);

    }
}
