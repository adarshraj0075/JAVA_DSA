public class RecursionSortedArray {
    public static void main(String[] args){
        int nums[]={1,2,3,4,5};
        boolean ans=sorted(nums, 0);
        System.out.println(ans);

    }
    static boolean sorted(int nums[],int i){
        if(i==nums.length-1){
            return true;
        }
        return nums[i]<nums[i+1] && sorted(nums,i+1);
    }
    
}
