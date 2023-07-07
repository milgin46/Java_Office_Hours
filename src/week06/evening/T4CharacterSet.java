package week06.evening;

public class T4CharacterSet {
    /*
    T4CharacterSet [methods, loops]

    Create a method that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    based on the defined parameter return a String will all of the characters in the range

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.
     */

    public static void main(String[] args) {


        //Create a method that has a String parameter and returns a String.
        //we wil provide one string and inside the method we will do some actions and return the result
        String result=getCharSet("special");
        System.out.println("result = " + result);
    }

    public static String getCharSet(String option) {

        char start=' ';
        char end=' ';

        //if you convert your string to lowercase than we will not care about the letters
        switch (option.toLowerCase()) {
            case "uppercase":
                //if it is uppercase:
                start='A';
                end='Z';
                break;
            case "lowercase":
                //if it is lowercase:
                start='a';
                end='z';
                break;
            case "digit":
                //if it is digit:
                start='1';
                end='9';
                break;
            case "special":
                //if it is special:
                start='!';
                end='.';
                break;
        }
        String result="";

        for (char i = start; i <=end ; i++) {
            result+=i;
        }
        return result;
    }
}
