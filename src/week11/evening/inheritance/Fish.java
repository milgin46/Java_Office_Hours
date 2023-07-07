package week11.evening.inheritance;
//           Fish   is an    Entree
public class Fish   extends  Entree    {

    public String fishType;

    @Override
    public String toString() {
        return "Fish{" +
                "fishType='" + fishType + '\'' +
                ", specialForEntry='" + specialForEntry + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
