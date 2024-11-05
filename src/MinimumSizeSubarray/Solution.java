package MinimumSizeSubarray;

class Solution {
   public int minSubArrayLen(int target, int[] nums) {
      if(nums.length<=1) return nums[0] >= target ? 1 : 0;
      int result = Integer.MAX_VALUE, left = 0, right =1, sum = nums[left];
      while(left<right){
         if(sum<=target && right<nums.length){
            sum += nums[right];
            if(sum>=target)
               result = Math.min(right-left+1,result);
            ++right;
         } else {
            if(result == Integer.MAX_VALUE)
               if(sum>=target)
                  result = Math.min(right-left,result);
            sum -= nums[left];
            ++left;
            if(sum>=target)
               result = Math.min(right-left,result);
         }
      }
      return result == Integer.MAX_VALUE ? 0 : result;
   }

}