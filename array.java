public class array {
    public static void main(String[] args){
        //-->>1st way of difining a Array
        //int marks[]=new int[3];
        //marks[0]=90;
        //marks[1]=29;
        //marks[2]=89;

        //-->>2nd way of defining a Array
        int marks[]={90,29,89};

        //System.out.println(marks); -->>This will print jargan value

        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        
        for(int i=0;i<3;i++){
            System.out.println(marks[i]); 
        }
    }
    
}
