import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(a);
        int search=sc.nextInt();

        boolean flag=false;

        int l=0;
        int h=a.length-1;

        while(l<=h){
            int m=(l+h)/2;

            if(a[m]==search){
                System.out.println("Element found " );
                flag=true;
                break;
            }

            if(a[m]<search){
                l=m+1;
            }

            if(a[m]>search){
                h=m-1;
            }
        }

        if(flag==false){
            System.out.println("Element not found");
        }

       // System.out.println(Arrays.binarySearch(a,search));-->>This 1st method


    }
    
}
