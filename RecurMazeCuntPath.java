public class RecurMazeCuntPath {
    public static void main(String[] args){
        System.out.println(countPath(3,3));
       
    }

    static int countPath(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int rowCount=0;
        int columnCount=0;
         rowCount=rowCount+countPath(r-1,c);
         columnCount=columnCount+countPath(r,c-1);

        return (rowCount+columnCount);
    }
    
}
