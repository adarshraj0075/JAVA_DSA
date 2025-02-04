public class RecursionN_1 {
    public static void main(String[] args){
        print1(5);

    }
    static void print1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        print1(n-1);
        
    }

    static void print(int n){
        if(n<1){
            return;
        }
        
        print(n-1);
        System.out.println(n);
    }

    static void print2(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        print2(n-1);
        System.out.println(n);
    }
    
}
