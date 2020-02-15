package Chap2;

/**
 * @author Zhengyi
 * @create 2020-02-09 12:16
 * @desc
 **/
public class Chap2_2 {
    public static void main(String[] args) {
        int varA = 0;
        System.out.println("00000");
        for(int i=1;i<32;i++){
                varA++;
            if(varA < 2){
                System.out.println("0000" + Integer.toBinaryString(varA));
            }else if(varA < 4){
                System.out.println("000" + Integer.toBinaryString(varA));
            }else if(varA < 8){
                System.out.println("00" + Integer.toBinaryString(varA));
            }else if(varA < 16){
                System.out.println("0" + Integer.toBinaryString(varA));
            }else{
                System.out.println(Integer.toBinaryString(varA));
            }
        }
    }
}
