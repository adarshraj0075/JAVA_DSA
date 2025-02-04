public class Reccursion1_N {
    public static void main(String[] args){
        System.out.println(print(1));
    }
    static int print(int n){
        if(n==5){
            return n;
        }
        System.out.println(n);
       return print(n+1);
    }
    
}
