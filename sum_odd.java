import java.util.*;
public class sum_odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println("the sum of all odd num : " + sum);
    }
    
}
