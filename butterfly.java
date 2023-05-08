public class butterfly {
    public static void main(String[] args){
        int n=4;
        //upper half
        for(int i=1;i<=4;i++){
            //first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    //Lower Half
    for(int i=n;i>=1;i--){
        //first part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //Spaces
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        //second part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
       



    }
    
}
