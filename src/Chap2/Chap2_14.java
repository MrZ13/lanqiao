package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-12 22:07
 * @desc
 **/
import java.util.*;
public class Chap2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hour,min,second;
        hour = time / 3600;
        min = (time % 3600)/60;
        second = (time%3600)%60;
        System.out.println(hour+":"+min+":"+second);
    }
}
