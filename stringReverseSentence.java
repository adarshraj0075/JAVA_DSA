import java.util.*;
public class stringReverseSentence {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String stringarr[]=str.split(" ");
    String result="";
    for(int i=stringarr.length-1;i>=0;i--){
           result+=stringarr[i]+" ";
    }
    System.out.println(result);
}
}
