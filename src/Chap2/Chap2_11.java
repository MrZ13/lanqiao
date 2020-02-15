package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-11 12:56
 * @desc
 **/
import java.math.BigInteger;
import java.util.*;
public class Chap2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input.toLowerCase();
        BigInteger number = new BigInteger(input,16);
//        int number = Integer.parseInt(input,16);
        System.out.println(number);
    }
}
