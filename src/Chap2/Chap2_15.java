package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-13 11:59
 * @desc
 **/
import java.util.*;
public class Chap2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.length()!=str2.length()){
            System.out.println("1");
        }else if(str1.equals(str2)){
            System.out.println("2");
        }else if(str1.toUpperCase().equals(str2.toUpperCase())){
            System.out.println("3");
        }else{
            System.out.println("4");
        }
    }
}
