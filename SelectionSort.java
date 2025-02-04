import java.util.*;
public class SelectionSort {
    public static void main(String agrs[]){
        int arr[]={8,3,4,9,1};
        for(int i=0;i<arr.length-1;i++){
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    minIdx=j;
                }
            }
            int swap=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=swap;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
