package SplitArrayLargestSum;

public class Solution {

   public int splitArray(int[] nums, int k) {
      int lower = Integer.MAX_VALUE, upper = 0, max = Integer.MIN_VALUE;
      for(int element : nums) {
         upper += element;
         lower = Math.min(element, lower);
         max = Math.max(max, element);
      }
      if(k==1) return upper;
      if(k==nums.length) return max;
      int ans = Integer.MIN_VALUE;
      while(lower<=upper) {
         int mid = (lower+upper) >> 1;
         int maxTime = maxTime(nums,k,mid);
         if(maxTime == Integer.MIN_VALUE) lower = mid+1;
         else {
            ans = mid;
            upper = mid-1;
         }
      }
      return ans;
   }

   public int maxTime(int[] nums, int k, int limit) {
      int _limit = 0, maxTime = Integer.MIN_VALUE;
      for(int i=0; i<nums.length && k>0; i++) {
         _limit += nums[i];
         if(_limit<=limit) {
            maxTime = Math.max(_limit,maxTime);
            if(i==nums.length-1) return maxTime;
         } else {
            _limit = 0;
            --i;
            --k;
         }
      }
      return Integer.MIN_VALUE;
   }

   
}
