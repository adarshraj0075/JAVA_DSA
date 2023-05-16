public class pattern_pascal {
    public static void main(String[] arg){
        for(int i=1;i<=5;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                num=num*(i-j)/(j+1);
                System.out.print(num);


            }
            System.out.println();
        }
    }
    
}
