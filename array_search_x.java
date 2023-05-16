import java.util.*;
public class array_search_x {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter the number which you want to be stored in array");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Enter The value of x");
        int x=sc.nextInt();
        
        for(int i=0;i<size;i++){
            if(number[i]==x){
                System.out.println("x found at index :"+i);
            }
        }
    }
    
}

