package week15.evening;

public class Library {

    public void getLibrary(String city){
        if (city.equals("Fairfax") || city.equals("McLean")){
            System.out.println("Library Card Created");
        }else {
            throw new NonResidentException("library card is not created please check");
        }
    }

    public void borrow(boolean checkOut) throws FailToCheckOutException{
        if (checkOut){
            System.out.println("Enjoy reading");
        }else {
            throw new FailToCheckOutException("You can not check it out");
        }
    }
}
