public class RecursionStar {
    public static void main(String[] args){
        printStar(4, 0);

    }

    static void printStar(int r,int c){
        if(r==0){
            return;
        }

        if(c<r){
            System.out.print("*");
            printStar(r, c+1);
        }else{
            System.out.println();
            printStar(r-1, c=0);
        }
    }
    
}
