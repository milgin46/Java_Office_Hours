package week08.morning;

import utils.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

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

   public static String longestPalindrome(String [] words){

      String longest = "";

      for(String each : words){

         String reverse = StringUtils.reverse(each);

         if(reverse.equals(each) && reverse.length() > longest.length()){
            longest = each;
         }
      }

      return longest.isEmpty() ? "No Palindrome Found": longest;
   }

   public static void main(String[] args) {
      String[] strs = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};

      String[] strs2 = {"abc", "hello", "java"};

      System.out.println(longestPalindrome(strs));
      System.out.println(longestPalindrome(strs2));

      Scanner input = new Scanner(System.in);
      System.out.println("How many words do you want to add");
      String[] inputWords = new String[input.nextInt()];
      input.nextLine();

      for(int i = 0; i < inputWords.length; i++){
         System.out.println("Enter word " + (i + 1));
         inputWords[i] = input.nextLine();
      }

      System.out.println(Arrays.toString(inputWords));
      System.out.println(Arrays.toString(T3ReverseEach.reverseEach(inputWords)));
      System.out.println(longestPalindrome(inputWords));

   }



}
