import java.util.Arrays;

public class RecursionQuickSort {
    public static void main(String[] args){
        int nums[]={5,4,3,2,1};
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int nums[],int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int piviot=nums[mid];

        while(s<=e){
            while(nums[s]<piviot){
                s++;
            }
            while (nums[e]>piviot) {
                e--;
            }
            
            if (s<=e) {
                int swap=nums[s];
                nums[s]=nums[e];
                nums[e]=swap;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, hi);
    }
    
}
