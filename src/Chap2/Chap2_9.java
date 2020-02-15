package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-11 10:59
 * @desc
 **/
import java.util.*;

public class Chap2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 10000; i <= 99999 ; i++) {
            int a,b,c,d,e;
            a = i/10000;
            b = (i-a*10000)/1000;
            c = (i-a*10000-b*1000)/100;
            d = (i-a*10000-b*1000-c*100)/10;
            e = i-a*10000-b*1000-c*100-d*10;
            if((a==e)&&(b==d)&&(a+b+c+d+e == input)){
                System.out.println(i);
            }
        }
        for (int i = 100000; i <= 999999 ; i++) {
            int a,b,c,d,e,f;
            a = i/100000;
            b = (i-a*100000)/10000;
            c = (i-a*100000-b*10000)/1000;
            d = (i-a*100000-b*10000-c*1000)/100;
            e = (i-a*100000-b*10000-c*1000-d*100)/10;
            f = i-a*100000-b*10000-c*1000-d*100-e*10;
            if((a==f)&&(b==e)&&(c==d)&&(a+b+c+d+e+f == input)){
                System.out.println(i);
            }
        }

    }
}
