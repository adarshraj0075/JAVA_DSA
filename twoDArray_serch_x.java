import java.util.*;
public class twoDArray_serch_x {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the no of colns");
        int colns=sc.nextInt();
        int number[][]=new int[rows][colns];
        
        //input
        for(int i=0;i<rows;i++){ //rows
            //colns
            for(int j=0;j<colns;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                if(number[i][j]==x){
                    System.out.println("X found at :"+i+","+j);
                }
            }
        }
    }
    
}
