import java.util.*;
public class array {
    public static void main(String[] args){
        //int marks[]=new int[3];
        //int marks[]={95,94,96};
       // marks[0]=95;
        //marks[1]=94;
        //marks[2]=96;
      //  System.out.println(marks[0]);//-->This will give garbage or jargan value
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        //Input
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        //output
        

        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
    
}
