package Chap1;

/**
 * @author Zhengyi
 * @create 2020-02-09 11:56
 * @desc
 **/
import java.util.*;
public class Chap1_4 {
    public static void main(String[] args) {
        int[] fibo = new int[1000000];
        fibo[0] = fibo[1] = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            fibo[i]=(fibo[i-2]+fibo[i-1])%10007;
        }
        System.out.println(fibo[n-1]);
    }
}
