import java.util.*;
public class twoDArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the no. of colns");
        int colns=sc.nextInt();
        int number[][]=new int[rows][colns];
        System.out.println("Enter the matrix you want to stored in array");
        //INPUT
        for(int i=0;i<rows;i++){//Rows
            for(int j=0;j<colns;j++){
                number[i][j]=sc.nextInt();
            }
        }
        //OUTPUT
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    } 
}
