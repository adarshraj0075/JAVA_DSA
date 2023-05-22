import java.util.*;
public class reverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       char ch[]=str.toCharArray();
       String res="";
       for(int i=ch.length-1;i>=0;i--){
        res+=ch[i];
       }
       System.out.println(res);        
    }

    
}
