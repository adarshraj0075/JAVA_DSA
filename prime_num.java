import java.util.*;
public class prime_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                
            }
        }
        if(count>0){
            
            System.out.println("n is a not prime number");
        }
        else{
            
            System.out.println("n is a prime number")
            
            ;}
        }
        
    }
    
    