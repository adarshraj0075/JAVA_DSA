import java.util.*;
public class araylist_sort {
    public static void main(String[] args){

        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(6);

        System.out.println(list);

        Collections.sort(list); //Sorted in ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        


    }
    
}
