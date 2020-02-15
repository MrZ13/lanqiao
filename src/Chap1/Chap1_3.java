package Chap1; /**
 * @author Zhengyi
 * @create 2020-02-09 11:44
 * @desc
 **/

import java.text.DecimalFormat;
import java.util.*;


public class Chap1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14159265358979323;
        double n = sc.nextDouble();
        double target =  n * n * PI;
        DecimalFormat df = new DecimalFormat("###.0000000");
        System.out.println(df.format((target)));
    }


}
