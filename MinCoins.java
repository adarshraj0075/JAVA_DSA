public class MinCoins {
    public static void main(String[] args){
        int coins[]={1,2,5,10};
        int amount=276;
        int minCount=0;
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
               minCount+=amount/coins[i];
                amount =amount%coins[i];
            }
            
        }
        System.out.println(minCount);
    }
    
}
