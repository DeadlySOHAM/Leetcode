package BuySellStock2;

// with dynamic Programming and Recursion
// Time Limit exceeded

public class Solution2 {

   // 1 : sell, 0 : buy
   private int recursiveFunction(int currentIndex, int buySell, int[] prices, int[][] memory){
      if(currentIndex == prices.length) return 0;
      if(memory[currentIndex][buySell]!=0) return memory[currentIndex][buySell];
      int profit = 0;
      if(buySell==1) {
         int ifSell = prices[currentIndex] + recursiveFunction(currentIndex+1, 0, prices, memory);
         int ifSkip = recursiveFunction(currentIndex+1, buySell, prices, memory);
         profit = Math.max(ifSell,ifSkip);
      } else {
         int ifBuy = -1*prices[currentIndex] + recursiveFunction(currentIndex+1, 1, prices, memory);
         int ifSkip = recursiveFunction(currentIndex+1, buySell, prices, memory);
         profit = Math.max(ifBuy,ifSkip);
      }
      memory[currentIndex][buySell] = profit;
      return profit;
   }
   public int maxProfit(int[] prices) {
      return recursiveFunction(0, 0, prices, new int[prices.length][2]); // starting as sold, so that starts with buy
   }   
}
