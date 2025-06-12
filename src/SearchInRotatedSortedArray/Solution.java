package SearchInRotatedSortedArray;

class Solution {
   public int search(int[] nums, int target) {

      if(nums.length==1) return nums[0] == target?0:-1;
      else if(nums.length==2) return nums[0] == target?0:nums[1]==target?1:-1;

      int i=1, k=0;

      while(i<nums.length && nums[i-1]<nums[i]) i++;
      k = nums.length-i;
      
      int l=0, u=nums.length;
      while(l<u) {
         int mid = (l+u)/2;
         int virtualMid = mid-k;
         if(virtualMid<0) virtualMid += nums.length;
         if(nums[virtualMid] == target) return virtualMid;
         else if(nums[virtualMid]<target) l = mid+1;
         else u = mid;
      }
      return -1;
   }
}