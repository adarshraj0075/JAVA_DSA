import java.util.*;

public class HashMapExample {
    public static void main(String args[]){
        //Create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",50);

        System.out.println(hm);

        //Get 
        // int populationIndia=hm.get("india");
        // System.out.println(populationIndia);

        // //containsKey()
        // System.out.println(hm.containsKey("india"));
        // System.out.println(hm.containsKey("indonesia"));

        //Remove
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

    }
}
