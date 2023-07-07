package week09.morning;

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

        // assume the number can only go to 9

        String request = "img2;div2;button3;ul1";
        String[] eachPart = request.split(";");
        System.out.println(Arrays.toString(eachPart));
        String html = "";

        for(String each : eachPart){

            String tag = each.substring(0, each.length() - 1);
            int num = Integer.parseInt(each.replace(tag, "")); // each.substring(each.length()-1)
            String fullTag = "<" + tag + "> </" + tag + ">\n";

            html += fullTag.repeat(num);
            /*
                instead of repeat method
                for(int i = 0; i < num; i++){
                    html += fullTag;
                }
             */

        }

        System.out.println(html);

    }
}
