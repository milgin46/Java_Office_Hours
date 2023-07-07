package week05.evening;

public class T1GoodString {

    /*
    T1GoodString [String, indexes]

	Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false

	ex:
		goodday --> false
		agoodmovie --> true
		nogoodtoday -> true
		notgoodfornow -> false
     */

    public static void main(String[] args) {

        //we need to know how to find index of char or string
        //if it is string it will gie me the index of first char
        //we are able to find the index with indexOf() method
                   //0123
        String name="Adam";

        System.out.println(name.indexOf("dam"));
                   //012345678910
        String word="nogoodtoday";
        String mySearchedWord="good";
        System.out.println(word.indexOf(mySearchedWord)); //1

        if (word.indexOf(mySearchedWord)==1 ||word.indexOf(mySearchedWord)==2 ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }

}
