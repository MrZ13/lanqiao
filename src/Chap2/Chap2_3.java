package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-10 11:31
 * @desc
 * 注意：这道题的题目非常模糊，下面这个答案是按照类似于首尾相连的纸带的逻辑来处理的
 * 但是实际上并不是，详见官网上的input3/output3
 * 这道题我的最终得分为60
 * 此外，还要注意一下特殊情况，比如1,1
 **/
import java.util.*;
public class Chap2_3 {
    //用于执行移位操作的函数，由于每次的移位操作都是固定的，所以不用输入其他参数
    public static char[] shiftFunc(char[] temp){
        char[] outcome = temp;
        char t = temp[temp.length-1];
        for (int i = temp.length-2; i >=0 ; i--) {
            outcome[i+1]=outcome[i];
        }
        outcome[0] = t ;
        return outcome;
    }
    public static void main(String[] args) {
        //大写字母ascii码从65开始，到90结束
        //n行m列
        Scanner sc = new Scanner(System.in);
        //行
        int n = sc.nextInt();
        //列
        int m = sc.nextInt();
        char[] target = new char[2*m-2];
        for (int i = 0; i < m; i++) {
            target[i+m-2] = (char)(i+65);
        }
        for (int i = 0; i < m-2 ; i++) {
            target[i] = (char)(65+m-2-i);
        }
        String tar = "";


        for (int i = 0; i < n ; i++) {
            if(i!=0){
            target = shiftFunc(target);
            }
            //下面这个for循环纯粹用于打印，不做其他逻辑判断的工作
            for (int j = 0; j < m  ; j++) {
                tar = tar + target[j+m-2];
            }
            System.out.println(tar);
            tar = "";
        }
    }
}
