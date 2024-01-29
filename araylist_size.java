import java.util.*;
public class araylist_size {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());

        //iterating whole arraylist
        // for(int i=0;i<list.size();i++){
        //    System.out.println(list.get(i));
        //}

        //Printing reverse of arraylist
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) +" ");
        }
    }
    
}
