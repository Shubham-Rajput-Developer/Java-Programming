public class MaxProfitStock {
    public static void CalculateMaxProfit(int prices[]){
        int maxProfit = 0;
        int buyPrices = Integer.MAX_VALUE; //max value , not used 0 here.
        for(int i=0;i<prices.length;i++){
            if(buyPrices<prices[i]){
                int profit = prices[i]-buyPrices; //today profit
                maxProfit = Math.max(profit, maxProfit); //global max porfit
            }
            else{
                buyPrices = prices[i];
            }
        }
        System.out.println("Max profit is : "+maxProfit);
    }
    public static void main(String args[]){
        int prices[] = {3,2,6,4,1,8,5};
        CalculateMaxProfit(prices);
    }
}
