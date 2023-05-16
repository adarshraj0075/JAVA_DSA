import java.util.*;
public class twoDArray_transpose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the no of colns");
        int colns=sc.nextInt();
        int matrix[][]=new int[rows][colns];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("this is array matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("This is transpose matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();67
        }

    }
    
}
