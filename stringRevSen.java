import java.util.*;
public class stringRevSen {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String sen=sc.nextLine();
    String s[]=sen.split(" ");
    String res="";
    for(int i=s.length-1;i>=0;i--){
        res+=s[i]+" 
        ";
    }
    System.out.println(res);
  }  
}
