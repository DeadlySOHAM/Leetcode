package Sum3Closest;

public class Solution {
   
   public int threeSumClosest(int[] nums, int target) {
      int min = Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
               int sum = nums[i]+nums[j]+nums[k];
               min = Math.abs(target-min)>Math.abs(target-sum)?sum:min;
            }
         }
      }
      return min;
   }
}
