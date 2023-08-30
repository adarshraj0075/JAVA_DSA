import java.util.*;

public class stringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        char c1[]=word1.toCharArray();
        char c2[]=word2.toCharArray();
        int count=0;
        if(word1.length() != word2.length()){
            System.out.println("This string is not anagram");
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<word1.length();i++){
               if(c1[i]!=c2[i]){
                count++;
               
               }
             
             
        }
        if(count>0){
            System.out.println("not anagram");    
        }
        else{
            System.out.println("this string is anagram");
        }

    }
}
