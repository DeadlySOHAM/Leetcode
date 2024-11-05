package SubarraySumEqualsK;

import java.util.*;

public class Solution {

   public int subarraySum(int[] nums, int k) {
      int sum = 0, counter = 0;
      HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();
      table.put(0,1);
      for(int i=0;i<nums.length;i++) {
         sum += nums[i];
         if(table.containsKey(sum-k)){
            counter += table.get(sum-k);
         }
         if(!table.containsKey(sum))
            table.put(sum,1);
         else {
            table.put(sum,table.get(sum)+1);
         }
      }
      return counter;
   }
   
}
