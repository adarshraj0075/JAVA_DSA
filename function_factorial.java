import java.util.*;
public class function_factorial {
    public static int calculateFactorial(int n){
        int factorial=1;
        for(int i=n;i>0;i--){
            factorial=factorial*i;
        }
        return factorial;
         
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial= calculateFactorial(n);
        System.out.println(factorial);

    }
}
   