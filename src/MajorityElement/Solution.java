package MajorityElement;

import java.util.*;

public class Solution {
   public int majorityElement(int[] nums) {
      int majorityElement = 0, k = (int)nums.length/2;
      HashMap<Integer,Integer> table = new HashMap<Integer,Integer>(nums.length);
      for(int e:nums){
         Integer memory = table.get(e);
         if(memory == null) {
            memory = Integer.valueOf(1);
            table.put(e,memory);
         } else {
            table.put(e,++memory);
         }
         if(memory>k) majorityElement = e;
      }
      return majorityElement;
   }
}
