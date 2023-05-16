import java.util.*;
public class count_Posi_negative_zero {
    public static void main(String[] args) {
        int positive=0;
        int negative=0;
        int zeros=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to count? :");
        int numcount=sc.nextInt();
        for(int i=1;i<=numcount;i++){
            System.out.print("Enter no " + i+":");
            int num=sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zeros++;
            }
        }
        System.out.println("The count of positve no is :" + positive);
        System.out.println("The count of negative no is :" + negative);
        System.out.println("The count of zeros is :" + zeros);

        






        
    }
}
