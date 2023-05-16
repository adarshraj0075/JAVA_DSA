import java.util.*;
public class array_check_ascending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int number[]=new int[size];
        int count=0;
        System.out.println("Enter the number which you want to be stored in array of size : "+size);
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        //for loop for printing the array
        for(int i=1;i<number.length;i++){
            if(number[i]<number[i-1]){
                count++;
            }
        }
        if(count>0){
            System.out.println("The array is not sorted in ascending order");
        }
        else{
            System.out.println("array is sorted in ascending order");
        }
    }
    
}
