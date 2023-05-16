import java.util.*;
public class stringReplacingLetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'i'){
                result+='e';
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);


    }
    
}
