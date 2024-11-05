package BuySellStock3;

// same as buy sell stock2, added two transaction conditino

public class Solution2 {
   
   public int maxProfit(int[] prices) {
      int[][][] memory = new int[prices.length][2][3];
      for(int i=prices.length-1;i>=0;i--) {
         // 1 : sell, 0 : buy
         int limit = 0;
         while(limit<2){
            for(int buySell=0;buySell<2;buySell++) {
               int ifBuy = 0, ifSkip = 0;
               switch(buySell){
                  case 0 : // Buy
                     if(i==memory.length-1) {
                        ifBuy = 0; // cannot buy the last element as it cannot be sold later
                        ifSkip = 0;
                     } else {
                        ifBuy = -1*prices[i] + memory[i+1][1][limit];
                        ifSkip = memory[i+1][buySell][limit];
                     }
                  break;
                  case 1 : // Sell
                     if(i==memory.length-1){
                        ifBuy = prices[i];
                        ifSkip = 0;
                     } else {
                        ifBuy = prices[i] + memory[i+1][0][limit+1];
                        ifSkip = memory[i+1][buySell][limit];
                     }
                  break;
               }
               memory[i][buySell][limit] = Math.max(ifBuy,ifSkip);
            }
            ++limit;
         }
      }
      // No chance of selling the first item, so starts with buy or skip
      return memory[0][0][0];
   }
}
