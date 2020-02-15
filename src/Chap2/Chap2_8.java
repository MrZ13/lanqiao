package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-11 10:46
 * @desc
 **/
public class Chap2_8 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999 ; i++) {
            int a,b,c,d;
            a = i/1000;
            int mid_1 = i - a*1000;
            b = (i - a*1000)/100;
            int mid_2 = mid_1 - b*100;
            c = mid_2/10;
            d = mid_2 - c*10;
            if((a == d)&&(b==c)){
                System.out.println(i);
            }
        }
    }
}
