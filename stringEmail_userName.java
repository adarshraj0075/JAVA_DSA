import java.util.*;
public class stringEmail_userName {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Email id");
    String str=sc.nextLine();
    String reasult="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='@'){
           break;
        }
        else{
            reasult+=str.charAt(i);
        }
    }
    System.out.println("your user id is:"+reasult);
    
}
}
