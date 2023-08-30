import java.util.*;
public class linearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={14 , 15, 20, 40, 50};
        int searchElem=sc.nextInt();
        boolean flag=false;

        for(int i=0;i<a.length;i++){
            if(searchElem==a[i]){
                System.out.println("Element found at:"+i);
                flag=true;
                break;
            }
        }

        if(flag=false){
            System.out.println("Element not found");
        }
    }
    
}
