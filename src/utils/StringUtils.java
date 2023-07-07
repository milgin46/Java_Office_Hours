package utils;

public class StringUtils {

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isFirstAndLastLetterSame(String each) {

        each = each.toLowerCase(); //anna

        //I will get the first letter
        char firstLetter = each.charAt(0);
        //   String firstLetter = each.charAt(0)+"";

        //I will get the last letter
        char lastLetter = each.charAt(each.length() - 1);
        //  String lastLetter = each.charAt(each.length() - 1)+ "";

        // I will compare the letters if same I will increment my counter

        //  if (firstLetter.equals(lastLetter)) {
        return firstLetter == lastLetter;

    }

    public static boolean isPalindrome(String word) {
        //01234
        //civic

       /*
       c - c
       i- i

        */
        boolean result = true;
        for (int i = 0; i < word.length() / 2; i++) {
            char fromBeginning = word.charAt(i); //0
            char fromEnding = word.charAt(word.length() - 1 - i);

            if (fromBeginning != fromEnding) {
                result = false;
                break;
            }
        }
        return result;


    }

    /**
     * Capitalize will take any String and return each word in the String in a capitalized format.
     * Capitalized format is the first letter uppercase and the rest of the characters in lowercase
     * Words are separates by a space
     * This method is helpful for names, but may not be the best for sentences
     *
     * @param str
     * @return capitalized String
     */

    public static String capitalize(String str) {
        String[] eachWord = str.toLowerCase().trim().split(" ");
        String result = "";

        for (String each : eachWord) {
            result += each.substring(0, 1).toUpperCase() + each.substring(1) + " ";
        }

        return result.trim();
    }

}
