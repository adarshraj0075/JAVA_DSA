public class arrayLinearSrch {
    public static int linerSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={1,22,12,10,9,8,7,5};
        int key=10;
        int index=linerSearch(numbers, key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at : "+index);
        }
    }
    
}
