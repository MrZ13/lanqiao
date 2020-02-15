package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-11 10:41
 * @desc
 **/
public class Chap2_7 {
    public static void main(String[] args) {
        for (int i = 100; i < 999 ; i++) {
            int a,b,c;
            a = i / 100 ;
            b = (i - a*100)/10;
            c = i - a*100 - b*10;
            if(a*a*a+b*b*b+c*c*c == i){
                System.out.println(i);
            }
        }


    }
}
