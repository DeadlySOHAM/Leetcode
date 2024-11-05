package BuySellStock3;

import java.util.*;

// atmost two transaction condition not attached, cannot figure out a way

public class Solution {
   
   public int maxProfit(int[] prices) {
      int maxProfit = 0;
      ArrayList<int[]> records = new ArrayList<int[]>();
      for(int i=0;i<prices.length;i++) {
         int i_start = i;
         while(i+1<prices.length && prices[i]<prices[i+1]){++i;}
         if(i==i_start) continue;
         records.add(new int[]{i_start,i});
      }
      return maxProfit;
   }
}
