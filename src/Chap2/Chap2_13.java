package Chap2;


/**
 * @author Zhengyi
 * @create 2020-02-12 19:29
 * @desc
 **/
import java.util.*;

public class Chap2_13 {
    public static int[] swap(int[] target_array,int flag1,int flag2){
        if(flag1==flag2){
            return target_array;
        }
        int temp = 0;
        temp = target_array[flag1];
        target_array[flag1] = target_array[flag2];
        target_array[flag2] = temp;
        return target_array;
    }
    public static  int[] quickSort(int[] target_array,int start,int end){
        if (start<end){
            int l = start;
            int r = end;
            int temp = target_array[l];
            while(l<r){
                //从后向前找，找小于基准数的
                while((l<r)&&(target_array[r]>temp)){
                    r--;
                }
                if(l<r){
                    target_array[l] = target_array[r];
                }
                //从前往后找，找第一个大于基准数的
                while((l<r)&&((target_array[l])<temp)){
                    l++;
                }
                if(l<r){
                    target_array[r] = target_array[l];
                }
            }
            target_array[l]=temp;
            target_array = quickSort(target_array,start,l-1);
            target_array = quickSort(target_array,l+1,end);
        }else{
            return target_array;
        }
        return target_array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] target = new int[n];
        for (int i = 0; i < n ; i++) {
            target[i] = sc.nextInt();
        }
        //使用快速排序
        //值得注意的是，这道题使用递归的快排反而会运行超时，不如就用普通版的冒泡
//        target = quickSort(target,0,target.length-1);
        //使用简单的冒泡排序：

        int flag = 0;
        while(flag!=target.length-1){
            int min = target[flag];
            int temp = flag;
            for (int i = flag; i < target.length; i++) {
                if(target[i]<min){
                    min = target[i];
                    temp = i;
                }
            }
            target = swap(target,temp,flag);
            flag++;
        }

        for (int i = 0; i <target.length ; i++) {
            System.out.print(target[i]+" ");
        }
    }
}
