package week11.evening.inheritance;


//           Taco is an   Entree
public class Taco  extends  Entree  {

    @Override
    public String toString() {
        return "Taco{" +
                "specialForEntry='" + specialForEntry + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
