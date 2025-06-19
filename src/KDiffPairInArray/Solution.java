package KDiffPairInArray;

import java.util.*;

class Solution {
   public int findPairs(int[] nums, int k) {
      if (nums.length == 1)
         return 0;
      int result = 0;
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() {
         {
            for (int num : nums)
               put(num, getOrDefault(num, 0) + 1);
         }
      };
      for (int num : nums) {
         if (k == 0) {
            if (map.getOrDefault(num, 0) > 1) {
               result++;
               map.remove(num);
            }
         } else if (map.containsKey(num + k)) {
            map.remove(num + k);
            result++;
         }
         ;
      }
      return result;
   }
}
