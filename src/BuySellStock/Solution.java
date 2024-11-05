package BuySellStock;

import java.util.*;

public class Solution {
   
   public int maxProfit(int[] prices) {
      int max = 0;
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      for(int price : prices){
         if(pq.isEmpty()) pq.add(price);
         else {
            int diff =  price - pq.peek();
            max = Math.max(max,diff);
            pq.add(price);
         }
      }
      return max;
   }
}
