package week08.evening;

import java.util.Arrays;

public class T1ShiftDelete {
    /*
    T1ShiftLeft [array, loop]

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Ex:
        {1, 2, 3} -> [2, 3, 1]
        {17, 14, 5, 10} -> [14, 5, 10, 17]
        {7, 0, 1} -> [0, 1, 7]

     */

    public static void main(String[] args) {
        /*        // 0  1  2
          int [] a= {1, 2, 3};
           int temp=a[0]
           a[0]=a[1]
           a[1]=a[2]
           a[2]=temp;
         */
        int[] array = {1, 2, 3};
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1]=temp; //old array[0] which is 1
        System.out.println(Arrays.toString(array));


    }
}
