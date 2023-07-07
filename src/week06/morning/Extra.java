package week06.morning;

public class Extra {

    /*
        swap two character in a String

        hello
        swapChars("hello", 1, 3) -> hlleo

        swapChars("hamburger", 3, 6) -> hamgurber

     */

    public static String swapChars (String str, int firstIndex, int secondIndex){

        if(firstIndex > secondIndex || firstIndex == secondIndex || secondIndex >= str.length()){
            return str;
        }

        String result = "";

        char firstChar = str.charAt(firstIndex);
        char secondChar = str.charAt(secondIndex);

        result += str.substring(0, firstIndex) + secondChar + str.substring(firstIndex + 1, secondIndex) + firstChar + str.substring(secondIndex + 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(swapChars("hamburger", 3, 6));
        System.out.println(swapChars("hamburger", 3, 8));
        System.out.println(swapChars("hamburger", 3, 1100));
        System.out.println(swapChars("java", 0, 3));
        System.out.println(swapChars("java", 3, 0));
        System.out.println(swapChars("java", 3, 3));
    }

}
