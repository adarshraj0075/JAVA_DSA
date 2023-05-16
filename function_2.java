import java.util.Scanner;

public class function_2 {
    public static int calculateSum(int a,int b){
        int sum =a+b;
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("The sum of a+b is : "+sum);
    }
    
}
