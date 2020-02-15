package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-10 13:12
 * @desc
 **/

import java.util.*;

public class Chap2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] target = new int[n];
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            target[i] = sc.nextInt();
            if(i == 0){
                min = target[i];
                max = target[i];
                sum = target[i];
                continue;
            }
            if(target[i] < min){
                min = target[i];
            }else if(target[i] > max){
                max = target[i];
            }
            sum = sum + target[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
