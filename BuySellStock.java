import java.util.*;
public class BuySellStock {
    public static void main(String [] args){
        int prices[]={7,1,5,3,6,9};
        int priceAtStockBuy=99999999;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<priceAtStockBuy){
                priceAtStockBuy=prices[i];
            }
            maxProfit=Math.max(priceAtStockBuy,maxProfit);
            int profit=maxProfit-priceAtStockBuy;
            System.out.println(profit);
        }

    }
}
