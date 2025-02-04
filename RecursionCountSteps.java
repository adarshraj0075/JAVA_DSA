public class RecursionCountSteps {
    public static void main(String[] args){
        countSteps(14);
        System.out.println(count);

    }
    static int count=0;

    static void countSteps(int n){
        if(n<1){
            return;
        }
        if(n%2==0){
            countSteps(n/2);
            count++;
        }else{
            countSteps(n-1);
            count++;
        }
    }
    
    
}
