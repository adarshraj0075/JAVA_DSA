import java.util.*;
public class function_printAvg {
    public static int printAvg(int a,int b,int c){
       int avg=(a+b+c)/3;
        System.out.println("Avg of the 3 num :" + avg );
        return avg;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=printAvg(a,b,c);
    }
    
}
