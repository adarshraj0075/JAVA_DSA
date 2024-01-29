import java.util.ArrayList;
public class araylist {
    public static void main(String[] args){
        //java collection frame work
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //Add Element 
        list.add(1); //[O(1)]
        list.add(2); //[O(1)]
        list.add(3); //[O(1)]
        list.add(5);

        list.add(1,9);
        System.out.println(list);
        
        //Get operation
        int element=list.get(2);
        System.out.println(element);

        //Remove Element
        list.remove(2);
        System.out.println(list);

        //Set Element at index
        list.set(2, 4);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

        //Size of arraylist
        System.out.println(list.size());
    }
    
}

