package HouseRobber;

class Solution {
   public int rob(int[] nums) {
      return rob(nums,0, new int[nums.length]);
   }

   public int rob(int[] nums, int current, int[] memory) {
      if(current>=nums.length) return 0;
      if(memory[current]==Integer.MIN_VALUE) return 0;
      else if(memory[current]!=0) return memory[current];
      int result = Math.max(nums[current]+rob(nums,current+2,memory),rob(nums,current+1,memory));
      memory[current] = result==0?Integer.MIN_VALUE:result;
      return result;
   }
}