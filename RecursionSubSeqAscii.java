public class RecursionSubSeqAscii {
    public static void main(String[] args){
       subSeqAscii("", "abc");
    }
    
    static void subSeqAscii(String p,String up){
        if(up.isEmpty()){
           
            return;
        }

        char ch=up.charAt(0);
        System.out.println(p);
        subSeqAscii(p+(ch+0), up.substring(1));
       // subSeqAscii(p+ch, up.substring(1));
       // subSeqAscii(p, up.substring(1));
    
        
    }
}
