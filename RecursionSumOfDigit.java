public class RecursionSumOfDigit {
    public static void main(String[] args) {
      int ans= sumOfDigit(1234); 
      System.out.println(ans);
    }
    //n=1234
    static int sumOfDigit(int n){
        if(n==0){
            return n;
        }
        return n%10+sumOfDigit(n/10);
    }
    
}
