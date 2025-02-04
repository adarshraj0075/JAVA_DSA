public class Recursion_countZero {
    public static void main(String[] args){
      int ans=  countZero1(30204,0);
        System.out.println(ans);
    }

    static int count=0;

    public static void countZero(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        if(rem==0){
            count++;
        }
        countZero(n/10);
    }

    public static int countZero1(int n, int count){
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            count++;
        }

        return countZero1(n / 10, count);
    }
}

    



