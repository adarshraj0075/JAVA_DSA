import java.util.Arrays;

public class RecursionMergeSort {
    public static void main(String[] args){
        int nums[]={8,3,4,12,5,6};
       nums= sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    static int[] sort(int nums[]){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;

        int left[]=sort(Arrays.copyOfRange(nums,0,mid));
        int right[]=sort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left,right);
    }

    static int[] merge(int left[],int right[]){
        int mix[]=new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
               mix[k]=left[i];
               i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        //it is possible that one of the array either left of right 
        //might not added its all element to mix so we could do that by this

        while (i<left.length) {
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            mix[k]=right[j];
            k++;
            j++;
        }
        return mix;
    }
}