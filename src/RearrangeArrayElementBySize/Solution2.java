package RearrangeArrayElementBySize;

// Auxiliary Space Complexity : O(n)
// Time Compexity : (n)


public class Solution2 {

   public int[] rearrangeArray(int[] nums) {
      int[] result = new int[nums.length];
      int nextPositive = -1, nextNegative = -1;
      for(int i=0;i<result.length;i+=2){
         nextPositive = getNext(nums,true,nextPositive);
         nextNegative = getNext(nums,false,nextNegative);
         if(nextPositive!=-1) result[i] = nums[nextPositive];
         if(nextNegative!=-1) result[i+1]= nums[nextNegative];
      }
      return result;
   }

   public int getNext(int nums[], boolean positive, int current){
      while(++current<nums.length)
         if(positive && nums[current]>0 || !positive && nums[current]<0) return current;
      return current == nums.length?-1:current;
   }
}
