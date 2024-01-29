public class RecursionFibonaci {
    public static void main(String[] args) {
       
      System.out.println(fibo(4));

        
    }

    public static int fibo(int n){
        if(n<2 &&n>=0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    
}
