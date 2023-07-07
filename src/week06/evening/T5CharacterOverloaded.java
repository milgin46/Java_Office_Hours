package week06.evening;

public class T5CharacterOverloaded {

    /*
    T5CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
     */

    public static void main(String[] args) {

        //we will create first what we wll do in here so we will give to method twp parameter as char then we will
        // get the result as a String so :

        String result=getCharSet('7', 'P');

        System.out.println(result);

    }

    /**
     *  This is method will get two parameter and return the all chars between that chars.
     * @param start
     * @param end
     * @return String
     */

    public static String getCharSet(char start, char end) {
        //we need to create an empty string in order to pt our chars in it one by one and return it
        String result="";
        for (char i = start; i <=end ; i++) {
            result+=i;
        }
        return result;
    }
}
