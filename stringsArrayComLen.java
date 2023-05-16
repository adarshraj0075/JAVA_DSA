import java.util.*;
public class stringsArrayComLen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        String array[]=new String[size];
        int totLength=0;

        System.out.println("Enter the string of array whose combined length you want to find");
        
        for(int i=0;i<size;i++){
            array[i]=sc.nextLine();
            totLength+=array[i].length();
        }
        System.out.println(totLength);
    }    
}
