import java.util.*;
public class strings {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //String fullName=sc.nextLine();
    //System.out.println("full name is "+fullName);
    
    // concatenation --->> matlab 2 strings ko jodna

    String firstName="tony";
    String lastName="Starc";
    String FullName=firstName+" "+lastName;
    System.out.println(FullName);
    System.out.println("The size of full name is :"+ FullName.length());

    //charAt ==>>print every character of word.
    
    for(int i=0;i<FullName.length();i++){
        if(FullName.charAt(i)=='c'){
            
        }
        System.out.println(FullName.charAt(i));
    }


    }    
}
