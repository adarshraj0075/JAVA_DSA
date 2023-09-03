import java.util.*;
   
public class function_callByValue {
     public static void swap(int a, int b){
        //swap code
        int c=a;
        a=b;
        b=c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         
       swap(a,b);

        System.out.println("a = "+ a);
        System.out.println("a = "+ b);
    }
}
