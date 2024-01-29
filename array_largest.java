import java.util.*;
public class array_largest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
    int numbers[]={1,2,3,9,5,8};
    System.out.println(getLargest(numbers));

    
    
}
}