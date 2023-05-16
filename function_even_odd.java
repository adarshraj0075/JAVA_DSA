import java.util.*;
public class function_even_odd {
    public static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.print("The given number is : ");
        checkEvenOdd(n);
        

    }
    
}
