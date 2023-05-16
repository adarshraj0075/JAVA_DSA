import java.util.*;
public class function_sumOdd {
    public static int sumOdd(int n){
       int sum=0;
       for(int i=1;i<=n;i=i+2){
        sum=sum+i;
       }
       System.out.println("The sum of odd num is :" + sum);
     return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A num :");
        int n=sc.nextInt();
        int sum=sumOdd(n);

    }

    
}
