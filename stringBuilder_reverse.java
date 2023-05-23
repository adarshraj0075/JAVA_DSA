public class stringBuilder_reverse {
    public static void main(String[] args){
        StringBuilder reverse=new StringBuilder("Adarsh");
        for(int i=0;i<reverse.length()/2;i++){
            int front=i;
            int back=reverse.length()-i-1;
            char frontChar=reverse.charAt(front);
            char backChar=reverse.charAt(back);
            reverse.setCharAt(front, backChar);
            reverse.setCharAt(back, frontChar);
            
        }
        System.out.println(reverse);
    }

    
}
