package RearrangeArrayElementBySize;

// Auxiliary Space Complexity : O(1)
// Time Compexity : (n^2)


public class Solution {

   public int[] rearrangeArray(int[] nums) {
      
      if(nums[0]<0) {
         int i = 0;
         do{i++;} while(i<nums.length && nums[i]<0);
         do {
            int temp = nums[i];
            nums[i] = nums[i-1];
            nums[i-1] = temp;
         }while(--i>0);
      }

      if(nums.length<=2) return nums;
      
      for(int i=1;i<nums.length;i++){
         if(nums[i-1]<0 && nums[i]<0) {
            int j = i;
            while(++j<nums.length){if(nums[j]>0)break;}
            do {
               int temp = nums[j];
               nums[j] = nums[j-1];
               nums[j-1] = temp;
            }while(--j>i);
         } else if(nums[i-1]>0 && nums[i]>0) {
            int j = i;
            while(++j<nums.length){if(nums[j]<0)break;}
            do {
               int temp = nums[j];
               nums[j] = nums[j-1];
               nums[j-1] = temp;
            }while(--j>i);
         }
      }
      return nums;
   }
}
