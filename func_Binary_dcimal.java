import java.util.*;
public class func_Binary_dcimal {
    public static void binToDeci(int binarynum){
        int myNum=binarynum;
        int pow=0;
        int decimal=0;
        
        while(binarynum>0){
            int lastdigit=binarynum%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binarynum=binarynum/10;
        }
        System.out.println("The decimal num of " + myNum +" is " +decimal);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binToDeci(n);
    }
    
}
