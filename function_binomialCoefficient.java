import java.util.*;
public class function_binomialCoefficient {
    public static int calculateFactorial(int n){
        int factorial=1;
        for(int i=n;i>0;i--){
            factorial=factorial*i;
        }
        return factorial;
    }

    public static int binCoff(int n, int r){
        int fact_n=calculateFactorial(n);
        int fact_r=calculateFactorial(r);
        int fact_rMn=calculateFactorial(n-r);
        int binCoff=fact_n/(fact_r*fact_rMn);
        return binCoff;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int result=binCoff(n, r);
        System.out.println(result);
    }
    
}
