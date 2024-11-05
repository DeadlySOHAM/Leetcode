package LongestContinuousSubsequence;

import java.util.HashMap;

public class Solution2 {

   public int longestConsecutive(int[] nums) {
      int counter = 0;
      HashMap<Integer, Integer> table = new HashMap<Integer, Integer>(nums.length);
      for (int e : nums) {
         if (table.containsKey(e))
            continue;
         if (!table.containsKey(e))
            table.put(e, Integer.MIN_VALUE);
      }
      for(int e : nums){
         counter = Math.max(counter, getRecursiveCount(e, e, table));
      }
      return counter;
   }

   private int getRecursiveCount(int val, int caller, HashMap<Integer,Integer> table){
      int count = 1, memory = table.get(val);
      if(memory!=Integer.MIN_VALUE)
         return memory;
      if(table.containsKey(val+1) && val+1 != caller)
         count += getRecursiveCount(val+1, val, table);
      if(table.containsKey(val-1) && val-1 != caller)
         count += getRecursiveCount(val-1, val, table);
      table.put(val,count);
      return count;
   }
}
