import java.util.*;
public class func_ovrldng_datatyp {
    //function to calculate interger sum
    public static int sum(int a, int b){
        return a+b;
    }

    //function to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(2,4));
        System.out.println(sum(2.5f,2.5f));
    }
    
}
