import java.util.ArrayList;

public class RecursionSearch {
    public static void main(String[] args){
        int nums[]={1,2,3,3,4,4,4,5};
        //int target=3;
    //     boolean res=search(nums, 0, 3);
    //     System.out.println(res);

    //    int ans= searchIndex(nums, 0, 3);
    //    System.out.println(ans);

    //    searchAllIndex(nums, 0, 3);
    //    System.out.println(list);

    //    ArrayList<Integer>list=new ArrayList<Integer>();
    //    list=searchAllIndex2(nums, 0, 4, list);
    //    System.out.println(list);

       ArrayList<Integer>list1=new ArrayList<>();
       list1=searchAllIndex3(nums, 0,3);
       System.out.println(list1);

    }
    static boolean search(int nums[],int i,int target){
        if(i==nums.length-1){
            return false;
        }
        if(nums[i]==target){
            return true;
        }
        return search(nums,i+1,target);
    }

    //index Searching
    
    static int searchIndex(int nums[],int i,int target){
        if(i==nums.length-1){
            return -1;
        }
        if(nums[i]==target){
            return i;
        }
        return searchIndex(nums,i+1,target);
    }

    //Sotoring all index in an arrayList;

    static ArrayList<Integer>list=new ArrayList<>();
    static void searchAllIndex(int nums[],int i,int target){
        if(i==nums.length){
            return;
        }
        if(nums[i]==target){
            list.add(i);
        }
        searchAllIndex(nums,i+1,target);
    }

    //Returning array list by passing it as an argument

    static ArrayList<Integer> searchAllIndex2(int nums[],int i,int target,ArrayList<Integer>list){
        if(i==nums.length){
            return list;
        }
        if(nums[i]==target){
            list.add(i);
        }
        searchAllIndex2(nums,i+1,target,list);
        return list;
    }

    //Returning array list withot passing it as argument

    static ArrayList<Integer>searchAllIndex3(int nums[],int i,int target){
        ArrayList<Integer>list=new ArrayList<>();
        if(i==nums.length){
            return list;
        }
        if(nums[i]==target){
            list.add(i);
        }
        ArrayList<Integer>ans=searchAllIndex3(nums, i+1, target);
        list.addAll(ans);
        return list;
    }
}
