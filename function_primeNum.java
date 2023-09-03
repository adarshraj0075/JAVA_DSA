import java.util.*;
public class function_primeNum {
    /*public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }*/

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
  
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isPrime(a)) ;

    }
    
}
