import java.util.*;
public class stringBuilder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        //Set A char at index
        sb.setCharAt(4,'w');
        System.out.println(sb);

        //Insert A char at Some Index
        sb.insert(5,'o');
        System.out.println(sb);

        //Delete char at some Index
        sb.delete(4,5);
        System.out.println(sb);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        //Append a char ==>> It means Adding a char At End
        sb.append('o');
        System.out.println(sb);
       
        //Print length of string
        System.out.println(sb.length());
    }
    
}
