package week10.evening;

public class InterviewQuestion1 {

    public static void main(String[] args) {
        /*
        shirt is 6 dollar
        tshirt is 8 dollar
         */
      boolean result=  change(34,3,2); // if we have change we will rerun false if not we will return true

        System.out.println(result);
    }

    private static boolean change(int money, int numberOfShirt, int numberOfTshirt) {

      return (money- (numberOfShirt*6+numberOfTshirt*8))==0;

    }
}
