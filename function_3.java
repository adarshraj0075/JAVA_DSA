import java.util.*;
public class function_3 {
    public static int calculateProduct(int a,int b){

      return a*b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The product of two number is : "+calculateProduct(a,b));

    }
    
}
