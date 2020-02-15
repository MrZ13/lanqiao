package Chap1;
/**
 * @author Zhengyi
 * @create 2020-02-06 13:15
 * @desc
 **/

/*
这道题用来明确各种格式要求
（1）提交评测时，提交完整的类文件的代码
（2）主类的名必须为Main
（3）使用到Scanner时，必须import util包（此外还应该注意System.in这一部分）
 */

import java.util.*;
public class Chap1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
