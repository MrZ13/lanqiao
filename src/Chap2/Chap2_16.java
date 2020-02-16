package Chap2;


/**
 * @author Zhengyi
 * @create 2020-02-15 18:14
 * @desc
 **/
import java.util.*;
//这道题尤其要注意for loop中循环终止的条件为<=，而不是<
public class Chap2_16 {
    public static void print_number(int number){
        String str = number  + "=";
        //从最小的质数——2，开始遍历
        for (int i = 2; i <= number ; i++) {
            if(number % i == 0){
                str = str+i+"*";
                number = number / i;
                i--;
            }
        }
        System.out.println(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b ; i++) {
            print_number(i);
        }

    }

}
