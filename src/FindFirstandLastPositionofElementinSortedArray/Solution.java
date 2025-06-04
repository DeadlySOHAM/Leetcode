package FindFirstandLastPositionofElementinSortedArray;

public class Solution {

   public int[] searchRange(int[] nums, int target) {

      if(nums.length<=0) return new int[]{-1,-1};

      int l = 0, u = nums.length-1;
      int mid = (l + u) / 2;

      while (l <= u) {
         mid = (l + u) / 2;
         if (nums[mid] == target)
            break;
         else if (nums[mid] > target)
            u = mid - 1;
         else
            l = mid + 1;
      }
      if(nums[mid]!=target) return new int[]{-1,-1};
      l = mid; 
      u = mid;
      while(nums[l] == nums[mid] || nums[u]==mid) {
         if(l-1>=0 && nums[l-1]==target) --l;
         if(u+1<nums.length && nums[u+1]==target) ++u;
         
         if(
            ((l-1>=0 && nums[l-1]!=target) && 
            (u+1<nums.length && nums[u+1]!=target)) || 
            (l==0 && u>=nums.length-1) ||
            (nums[l]!=target && nums[u]!=target) ||
            (l==0 && u+1<nums.length && nums[u+1]!=target) ||
            (u+1==nums.length && l-1>=0 && nums[l-1]!=target) ||
            (u+1==nums.length && l-1<=0) || (l==u)
         ) break;
         
      }
      return new int[]{l,u};
   }
}
