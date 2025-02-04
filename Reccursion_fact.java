public class Reccursion_fact {
    public static void main(String [] args){
         int ans=factorial(5);
    }
    static int factorial(int n){
        if(n==1){
            return (n);
        }
       return n*factorial(n-1);
    }
}
