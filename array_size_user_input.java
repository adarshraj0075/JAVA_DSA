import java.util.*;
public class array_size_user_input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]= new int[size];
        //Taking Elements of Array from user
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        
        //Taking size from user
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }


    }

    
}
