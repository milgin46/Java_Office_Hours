package week07.evening;

import java.util.Scanner;

public class T3SortedOrder {

    /*
T3SortedOrder [loop, String]

    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetically order
        return false if the given String is not sorted

    Ex:
        input: "abcd"
        output: true

        input: "abzy"
        output: false
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // String word="abcdz";
        String word = scanner.next();

        boolean result = isSorted(word);
        System.out.println("result = " + result);
    }

    public static boolean isSorted(String word) {

        boolean result = true;
        //  word=word.toLowerCase();  //if you want to ignore the case-sensitive
        //word.length()-1
        for (int i = 0; i < word.length() - 1; i++) {
               // index of c can be  word.length()-2
            // index of d can be  word.length()-1
            //abcd
            char current = word.charAt(i);
            char next = word.charAt(i + 1);

            if (current > next) {
                result = false;
                break;
            }

        }


        return result;
    }
}
