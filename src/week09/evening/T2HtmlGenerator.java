package week09.evening;

import java.util.Arrays;

public class T2HtmlGenerator {
    /*

T2HtmlGenerator [String, wrapper class, loop, array]

    Create a program that will read the request for the HTML that will be generated. Each request will be made of the tags and how many times that tag should be repeated. Each separate HTML tag will be separated by a semi-colon;

    Tags should be surrounded in diamond brackets and each closing tag has a / too

    Note: we are not creating a fully valid HTML structure. It is just a task

    Ex:
        Input:
            div2;li1

        Output:
            <div> </div>
            <div> </div>
            <li> </li>

    Ex:
        Input:
            ul1;li3;button2

        Output:
            <ul> </ul>
            <li> </li>
            <li> </li>
            <li> </li>
            <button> </button>
            <button> </button>

     */

    public static void main(String[] args) {

        String input = "img2;div2;button3;ul1";                          // 0123456
        String[] arrayOfInput = input.split(";"); //["ul1","li3","button2"]
        System.out.println("Arrays.toString(arrayOfInput) = " + Arrays.toString(arrayOfInput));
        for (String eachInput : arrayOfInput) {
            //012
            //ul1
          //  eachInput=eachInput.substring(0,eachInput.length()-1);
            String tagName = getTagFromInput(eachInput); //I am getting only tags which are ul , li , button
            String s = eachInput.substring(tagName.length()); //we will get the number as a String
        //   String s=eachInput.replace(tagName,"");
            int numberOfTag = Integer.parseInt(s); //I want to find tag number

            for (int i = 0; i <numberOfTag ; i++) {
                System.out.println("<" +tagName +">" + " </"+tagName +">");
            }

        }


    }

    public static String getTagFromInput(String eachInput) {
        String tagName = "";
//I am sending ul1 I want to get only ul
        for (char c : eachInput.toCharArray()) {
              if (Character.isLetter(c))

           // if (!Character.isDigit(c))
                tagName += c;

        }

        return tagName;

    }
}
