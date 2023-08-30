import java.util.*;

public class fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range of series");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.println("the fibonnaci series of " + i + " term is : " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }

}
