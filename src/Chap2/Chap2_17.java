package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-16 20:05
 * @desc
 * 注意到：这道题的关键在于认识到矩阵的0次幂等于单位阵，
 * 不然在oj系统无法拿到满分
 **/
import java.util.*;
public class Chap2_17 {
    //用于作向量相乘运算的方法，返回一个long形数值
    public static long multi(long[][] target_matrix,long[][] origin_matrix, int i, int j){
        long result = 0;
        for (int k = 0; k < target_matrix.length ; k++) {
            result += target_matrix[i][k]*origin_matrix[k][j];
        }
        return result;
    }
    //用于作矩阵相乘运算的方法，返回一个新的矩阵
    public static long[][] exp(long[][] target_matrix,long[][] origin_matrix){
        long[][] temp_matrix = new long[target_matrix.length][target_matrix.length];
        for (int i = 0; i < target_matrix.length; i++) {
            for (int j = 0; j < target_matrix.length ; j++) {
                temp_matrix[i][j] = multi(target_matrix,origin_matrix,i,j);
            }
        }
        return temp_matrix;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        long[][] origin_matrix = new long[i][i];
        for (int k = 0; k < i ; k++) {
            for (int l = 0; l < i ; l++) {
                origin_matrix[k][l] = sc.nextInt();
            }
        }
        long[][] result_matrix = origin_matrix;
        //j==0,则返回一个单位矩阵
        if(j == 0){
            result_matrix = new long[i][i];
            for (int k = 0; k < i; k++) {
                result_matrix[k][k]=1;
            }
        }else{
            //否则进行相乘的运算
            for (int k = 0; k < j-1; k++) {
            result_matrix = exp(result_matrix,origin_matrix);
            }
        }

        for (int k = 0; k < i ; k++) {
            for (int l = 0; l < i ; l++) {
                System.out.print(result_matrix[k][l]+" ");
            }
            System.out.println();
        }
    }
}
