package week08.evening;

import utils.StringUtils;

public class T4LongestPalindrome {


    /*
    T4LongestPalindrome [array, loop, String]

    Create a program that will define a String array of words. Find the longest palindrome String from that array. If no palindrome is found print: No Palindrome Found

    Ex:
        {java, long word, civic, apple, racecar, mom, anna, really long word}
        longest palindrome is: racecar

        {abc, hello, world, java}
        No Palindrome Found
     */
    public static void main(String[] args) {
        //create an array
        String[] array = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};

        //we will get each element
        String longest = "";
        for (String each : array) {

            //we wil compare that word is palindrome or not if it is palindrome we wll check is the longest or not

            if (StringUtils.isPalindrome(each) && each.length() > longest.length()) {
                longest = each;
            }


        }

        System.out.println(longest);


    }


}
