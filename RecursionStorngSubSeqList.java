import java.util.*;
public class RecursionStorngSubSeqList {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<>();
        list=subSeq2("", "abc");
        System.out.println(list.toString());
    }

    static ArrayList<String> subSeq(String p, String up,ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

        subSeq(p+ch, up.substring(1), list);
        subSeq(p, up.substring(1), list);

        return list;
    }

    static ArrayList<String> subSeq2(String p, String up){
        ArrayList<String>list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);

       ArrayList<String>ans1=subSeq2(p+ch, up.substring(1));
       ArrayList<String>ans2=subSeq2(p, up.substring(1));
       list.addAll(ans1);
       list.addAll(ans2);
        return list;
    }
}
