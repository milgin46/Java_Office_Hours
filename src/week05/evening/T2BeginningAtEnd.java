package week05.evening;

public class T2BeginningAtEnd {
    /*
    T2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false

     */

    public static void main(String[] args) {
                    // 01234567
        String word = "educated";

        /*
        e  -- >0
        d  -- >1
        u  -- >2
        c
        a
        t          word.lenght()-3
        e          word.lenght()-2
        d          word.lenght()-1
         */



        //check if the first two characters  of a given String
        //get the first cahr
        char firstChar = word.charAt(0); //e
        char secondChar = word.charAt(1); //d
        String firstTwoChars =firstChar + secondChar+"";
        System.out.println("firstTwoChars = " + firstTwoChars);

        //the last two characters of the String.

        char lastChar=word.charAt(word.length()-1);
        char secondFromLast=word.charAt(word.length()-2);

        String lastTwoChars=""+secondFromLast+lastChar;
        System.out.println("lastTwoChars = " + lastTwoChars);

        //we need to compare first two ad last two


        if (firstTwoChars.equals(lastTwoChars)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }




    }
}
