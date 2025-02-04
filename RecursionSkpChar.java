public class RecursionSkpChar {
    public static void main(String[] args) {
        String str="baccadapple";
        String res=skipApple(str, "");
        System.out.println(res);
    }

    // static String skip(String str,String res){
    //     if(str.isEmpty()){
    //         return res;
    //     }
    //     char firstChar=str.charAt(0);

    //     if(firstChar=='a'){
    //         return skip(str.substring(1), res);
    //     }else{
    //         return skip(str.substring(1),res+firstChar);
    //     }
    // }

    static String skipApple(String str,String res){
        if(str.isEmpty()){
            return res;
        }
       // char firstChar=str.charAt(0);

        if(str.startsWith("apple")){
            return skipApple(str.substring(-3), res);
        }else{
            return skipApple(str.substring(1),res+str.charAt(0));
        }
    }
}
