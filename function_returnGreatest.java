import java.util.*;
public class function_returnGreatest {
    public static void returnGreatest(int a, int b){
        if(a>b){
           System.out.println("The greatest number is :" + a);
        }
        else{
            System.out.println("The greatest number is :" + b);
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd num");
        int b=sc.nextInt();
        returnGreatest(a,b);

    }
    
}
