package week08.morning;

import utils.StringUtils;

import java.util.Arrays;

public class T3ReverseEach {
    /*
    T3ReverseEach [array, loop, String]

    Create a program that will define a String array with some words. Reverse each given element and assign them to a new array for all the reverse words

    Ex:
        {can, you, join, the, team} -> [nac, uoy, nioj, eht, meat]

    Note: We will use reverse logic in the next task too, so make a reusable method that can help with that part
     */

    public static String[] reverseEach(String [] words){
        String[] reversed = new String[words.length];

        for(int i = 0; i < reversed.length; i++){
            reversed[i] = StringUtils.reverse(words[i]);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String[] arr = {"can", "you", "join", "the", "team"};
        System.out.println(Arrays.toString(reverseEach(arr)));

    }
}
