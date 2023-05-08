public class inv_half_pyramid {
    public static void main(String[] args){
        // int n=5;
        //for(int i=1;i<=4;i++){
        //    for(int j=1;j<=n-i;j++){
        //        System.out.print("*");
        //   }
        //    System.out.println();
        //}
        int n=4;
        for(int i=n;i>=1;i=i-1){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
