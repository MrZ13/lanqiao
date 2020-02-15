package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-11 11:48
 * @desc
 **/
import java.util.*;
public class Chap2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String output = new String();
        output = Integer.toHexString(input).toUpperCase();
        System.out.println(output);
    }
}
