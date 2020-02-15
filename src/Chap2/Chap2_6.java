package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-10 14:32
 * @desc
 **/
import java.util.*;
public class Chap2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //the 2-dimension-array
        int[][] tri = new int[n][n];
        //print the full triangle
        for (int i = 0; i < n ; i++) {
            //print a single line
            for (int j = 0; j <= i ; j++) {
                if(j==0) {
                    tri[i][j] = 1;
                    System.out.print(tri[i][j]+" ");
                }else if(j==i){
                    tri[i][j] = 1;
                    System.out.print(tri[i][j]);
                }else{
                    tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
                    System.out.print(tri[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
