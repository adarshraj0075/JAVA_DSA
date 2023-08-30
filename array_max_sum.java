import java.util.*;
public class array_max_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        Arrays.sort(number);
        for(int i=0;i<number.length;i++){
            sum+=number[i];
            System.out.print(number[i]);
        }
      
        System.out.println(sum);
        System.out.println();

    }
    
}
