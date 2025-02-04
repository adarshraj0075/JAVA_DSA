import java.util.*;
public class SubArrayCount {
    public static void main(String args[]){
        int nums[]={2,3,2,5,1};
        int k=3;
        int x=2;
        //int idx=0;
        int subArraycount=0;
        
        for(int i=0;i<nums.length-x;i++){
            int count=0;
            for(int j=i;j<i+x;j++){
               if(nums[j]<=k){
                count++;
               }

            }
            if(count==x){
                subArraycount++;
            }
        }
        System.out.println(subArraycount);
    }  
}
