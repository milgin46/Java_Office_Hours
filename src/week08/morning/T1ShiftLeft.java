package week08.morning;

import java.util.Arrays;

public class T1ShiftLeft {
    /*
   T1ShiftLeft [array, loop]

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Ex:
        {1, 2, 3} -> [2, 3, 1]
        {17, 14, 5, 10} -> [14, 5, 10, 17]
        {7, 0, 1} -> [0, 1, 7]
     */
    public static void main(String[] args) {

        int[] arr = {17, 14, 5, 10};
        int[] shifted = new int[arr.length];
        shifted[arr.length - 1] = arr[0]; // read the value in index 0 of arr and storing that value into the last index of the shifted array

        for(int i = 0; i < arr.length - 1; i++){
            shifted[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(shifted));

    }
}
