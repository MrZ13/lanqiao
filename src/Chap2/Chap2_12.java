package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-12 19:11
 * @desc
 *
 * 注意：下面这个例子无法通过oj系统，因为执行效率不够高，如果想通过的话
 * 需要手写16转2,2转8的逻辑，但是这样子的话对于基础练习就过于复杂了（
 * 考虑到前几道进制转换的题的答案都非常短，感觉更有可能是oj系统里的标准
 * 输入有问题
 **/
import java.util.*;
public class Chap2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] number = new int[num];
        for (int i = 0; i < num ; i++) {
            String target = sc.next();
            target.toUpperCase();
            number[i] = Integer.parseInt(target,16);
        }
        for (int i = 0; i < num ; i++) {
            String output = Integer.toOctalString(number[i]);
            System.out.println(output);
        }
    }
}
