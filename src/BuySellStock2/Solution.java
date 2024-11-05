package BuySellStock2;

// without dynamic Programming

public class Solution {
   public int maxProfit(int[] prices) {
      int maxProfit = 0;
      for(int i=0;i<prices.length;i++) {
         int i_start = i;
         while(i+1<prices.length && prices[i]<prices[i+1]){++i;}
         if(i==i_start) continue;
         maxProfit+= prices[i]-prices[i_start];
      }
      return maxProfit;
   }   
}
