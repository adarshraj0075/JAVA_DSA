import java.util.*;
public class functionPower {
    public static int printPower(int x,int n){
        int power=1;
        for(int i=1;i<=n;i++){
            power=power*x;
        }
        System.out.println("The power of number is :" + power);
        return power;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value : ");
        int x=sc.nextInt();   
        ........................................................................................................
        System.out.println("Enter the power : ");
        int n=sc.nextInt();
        int power=printPower(x,n);

    }
    
}
