import java.util.*;
public class Buy_Sell_Stock
{
    public static int Stock_price(int prices[])
    {
        int Max_profit = 0;
        int buy_prices = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(buy_prices<prices[i])
            {
                int Profit =  prices[i] - buy_prices;
                Max_profit = Math.max(Max_profit,Profit);
            }
            else
            {
                buy_prices = prices[i];
            }
        }
        return Max_profit;
    }
    public static void main(String args[])
    {
        int prices[] = {4,63,84,26,9,43,3,90};
        System.out.println("Maximum Profit is : "+Stock_price(prices));
    }
}