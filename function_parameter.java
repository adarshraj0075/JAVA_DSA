import java.util.*;
public class function_parameter {
    public static int calculateSum(int num1, int num2){ //parameters or formal parameter
        
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= calculateSum(a,b); //argument or actual parameter
        System.out.println("Sum is : " + sum); 
    }
}
