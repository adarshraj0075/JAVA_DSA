import java.util.*;
public class function_factorial {
    public static void printFactoril(int n){
        if(n<0){
           System.out.println("Enter a +ve number");
           return;
        }


        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a +ve number");
        int n=sc.nextInt();
        System.out.println("factorial is : ");
        printFactoril(n);
    }
    
    
}
