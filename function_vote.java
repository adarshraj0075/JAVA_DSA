import java.util.*;
public class function_vote {
    public static void aGe(int age){
        if(age>18){
            System.out.println("Eligble to vote");
        }
        else{
            System.out.println("Not Eligble to vote");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter voter age");
        int age=sc.nextInt();
        aGe(age);

    }
    
}
