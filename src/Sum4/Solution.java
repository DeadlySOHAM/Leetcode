package Sum4;
import java.util.*;

public class Solution {
   public List<ArrayList<Integer>> fourSum(int[] nums, int target) {
      List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      Arrays.sort(nums);
      boolean iflag = false;
      for(int i=0;i<nums.length-3;i++){
         for(ArrayList<Integer> iar : result)
            if(iar.get(0)==nums[i]){
               iflag = true;
               break;
            }
         if(iflag) {
            iflag = false;
            continue;
         }
         for(int j=i+1;j<nums.length-2;j++)  {
            for(int k=j+1;k<nums.length-1;k++)  {
               for(int l=k+1;l<nums.length;l++) {
                  long a = nums[i],
                     b = nums[j],
                     c = nums[k],
                     d = nums[l],
                     sum = a+b+c+d;
                  if(sum==target)   {
                     ArrayList<Integer> temp = new ArrayList<Integer>(4);
                     temp.add(nums[i]);
                     temp.add(nums[j]);
                     temp.add(nums[k]);
                     temp.add(nums[l]);
                     if(!result.contains(temp))
                        result.add(temp);
                  }
               }
            }
         }
      }
      return result;
   }

}
