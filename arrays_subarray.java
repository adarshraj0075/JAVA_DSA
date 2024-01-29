public class arrays_subarray {
    public static void printSubarray(int number[]){
        int sc=0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                    
                }
                System.out.println();
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args){
        int number[]={3,4,7,8};
        printSubarray(number);

    }
    
}
