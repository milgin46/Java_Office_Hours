package week09.evening;

import java.util.ArrayList;

public class ArrayAndArrayListSize {

    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=10;

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);

        System.out.println("length of array : "  + array.length); // 5
        System.out.println("length of arraylist : "  + arrayList.size()); //1

        array[1]=20; //we are assigning 20 inside second place which is index of 1
        arrayList.add(20);


        System.out.println("length of array : "  + array.length); // 5
        System.out.println("length of arraylist : "  + arrayList.size()); //2

        array[1]=0; // I am deleting only value

        arrayList.remove(1);

        System.out.println("length of array : "  + array.length); // 5
        System.out.println("length of arraylist : "  + arrayList.size()); //1










    }
}
