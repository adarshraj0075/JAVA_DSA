public class zero_one_trangle {
    public static void main(String[] args){
        int n =5;
        int one =1;
        int zero =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(one+" ");
                }
                else{
                    System.out.print(zero+" ");
                }
            }
            System.out.println();
        }
    }
    
}
