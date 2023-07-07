package week08.evening;

import java.util.Arrays;

public class T3ReverseEach {
/*

T3ReverseEach [array, loop, String]

    Create a program that will define a String array with some words. Reverse each given element and assign them to a new array for all the reverse words

    Ex:
        {can, you, join, the, team} -> [nac, uoy, nioj, eht, meat]

    Note: We will use reverse logic in the next task too, so make a reusable method that can help with that part
 */

    public static void main(String[] args) {
        //create an array
        String[] array = {"can", "you", "join", "the", "team"};

        //create an empty array for reversed words
        String[] reversedWords = new String[array.length];
        //get the elements one by one
        int index = 0;
        for (String each : array) {

            //reverse the word
            String reversedWord = reverse(each);
            //put the reversed word inside new array
            reversedWords[index++] = reversedWord;

        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedWords));


    }

    public static String reverse(String each) {
        String reversedWord = "";

        for (int i = each.length() - 1; i >= 0; i--) {
            reversedWord += each.charAt(i);
        }
        return reversedWord;

    }


}
