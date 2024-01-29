import java.util.*;
public class stringCompare {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        //compare string
        String name1=sc.nextLine();
        String name2=sc.nextLine();

        //compareTo()
        //This function check 3 condition
        //1. String1 > String2 : +ve value return
        //2. String1 == String2 : It will return 0
        //3. String1 < String2 : -ve value return

        if(name1.compareTo(name2)==0){
           System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not Equal");
            
        }
    }
    
}
