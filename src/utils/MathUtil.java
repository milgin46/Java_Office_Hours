package utils;

import java.text.DecimalFormat;

public class MathUtil {

    public static double format(double num){
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(num)); // 52.44
    }
    /*
        5.1 + "0.1" -> 5.10.1
        5.1 + 0.1 -> 5.2

     */

}
