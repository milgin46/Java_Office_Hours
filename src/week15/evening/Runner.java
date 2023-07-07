package week15.evening;

public class Runner {

    public static void main(String[] args) {
        Library library=new Library();
        library.getLibrary("XXXXXX");
      //  library.borrow(true);
       // m1();  // each time you have to handle if you use throw keyword
        m2();

    }

    public static void m1() throws FailToCheckOutException {
        Library library=new Library();
        library.borrow(true);
    }
/*
shortcut :
MAC : command + option + T
WINDOWS : Ctrl + Alt + T
 */
    public static void m2(){
        Library library=new Library();
        try {
            library.borrow(true);
        } catch (FailToCheckOutException e) {

        }
    }
}
