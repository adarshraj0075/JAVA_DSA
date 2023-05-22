import java.util.*;
public class size {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        String fina="";
        for(int i=1;i<=n+1;i++){
            String s=sc.nextLine();
            fina+=s;
        }
        System.out.println(fina.length());
    }
    
}
