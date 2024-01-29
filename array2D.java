import java.util.*;
public class array2D {
    public static boolean search(int num[][],int x){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                if(num[i][j]==x){
                    System.out.println("x found at : "+i+","+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int num[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        //Search x
        int x=sc.nextInt();

        //input

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                num[i][j]=sc.nextInt();
            }
        }

        //output

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        search(num, x);
    }
    
}
