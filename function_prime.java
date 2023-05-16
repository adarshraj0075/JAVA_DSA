import java.util.*;
public class function_prime {
    public static void printPrime(int n,int count){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("This is not a prime number");
        }
        else{
            System.out.println("This is prime number");
        }
        return;
        
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int count=1;
        printPrime(n, count);
        
    }
    
}
