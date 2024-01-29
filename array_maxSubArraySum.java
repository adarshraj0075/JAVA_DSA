public class array_maxSubArraySum {
    public static void maxSubArraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum=0;
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<numbers.length;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum : "+ maxSum);
    }
    public static void main(String[] args){
        int numbers[]={1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
    
}
