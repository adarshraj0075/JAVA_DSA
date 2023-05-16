import java.util.*;
public class array_max_min_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter the number which you want to stored in array");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];
            }
        }
        System.out.println("The maximum value of array is : "+max);
        System.out.print("The minimum value of array is : "+min);
    }
    
}
