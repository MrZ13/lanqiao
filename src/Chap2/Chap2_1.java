package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-09 12:12
 * @desc
 **/
import java.util.*;
public class Chap2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println("yes");
        }else if((year % 4 == 0) && (year % 100 !=0) ){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
