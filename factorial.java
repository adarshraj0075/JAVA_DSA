import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
            
        }
        System.out.println("The factorial of two number is : "+factorial);

    }
    
}
