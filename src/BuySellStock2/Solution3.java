package BuySellStock2;

// with dynamic Programming and Bottom Up approach

public class Solution3 {

   public int maxProfit(int[] prices) {
      int[][] memory = new int[prices.length][2];
      for(int i=prices.length-1;i>=0;i--){
         // 1 : sell, 0 : buy
         for(int buySell=0;buySell<2;buySell++){
            int ifBuy = 0, ifSkip = 0;
            switch(buySell){
               case 0 :
                  if(i==memory.length-1) {
                     ifBuy = 0; // cannot buy the last element as it cannot be sold later
                     ifSkip = 0;
                  } else {
                     ifBuy = -1*prices[i] + memory[i+1][1];
                     ifSkip = memory[i+1][buySell];
                  }
               break;
               case 1 :
                  if(i==memory.length-1){
                     ifBuy = prices[i];
                     ifSkip = 0;
                  } else {
                     ifBuy = prices[i] + memory[i+1][0];
                     ifSkip = memory[i+1][buySell];
                  }
               break;
            }
            memory[i][buySell] = Math.max(ifBuy,ifSkip);
         }
      }
      // No chance of selling the first item, so starts with buy or skip
      return memory[0][0];
   }
}
