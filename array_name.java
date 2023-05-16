import java.util.*;
public class array_name {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        String name[]=new String[size];
        System.out.println("Enter names which you want to store in array :");
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
    
}
