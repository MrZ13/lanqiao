package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-10 14:14
 * @desc
 **/
import java.util.*;
public class Chap2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] target = new int[n];
        for (int i = 0; i < n ; i++) {
            target[i] = sc.nextInt();
        }
        //the number that we are looking for
        int a = sc.nextInt();
        //output number
        int output = -1;
        for (int i = 0; i < n ; i++) {
            if(a == target[i]){
                output = i+1;
                break;
            }
        }
        System.out.println(output);
    }
}
