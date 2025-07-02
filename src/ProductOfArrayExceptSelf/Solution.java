package ProductOfArrayExceptSelf;

public class Solution {

   // ok
   public int[] productExceptSelf2(int[] nums) {
      int countOf0 = 0, indexOf0 = 0, product = 1;
      for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
            countOf0++;
            if(countOf0>1) {
               return new int[nums.length];
            }
            indexOf0 = i;
         } else {
            product*=nums[i];
         }
      }
      int[] result = new int[nums.length];
      if(countOf0>0) {
         result[indexOf0] = product;
         return result;
      }
      for(int i=0;i<nums.length;i++){
         result[i] = product/nums[i];
      }
      return result;
   }

   // good
   public int[] productExceptSelf(int[] nums) {
      int[] result = new int[nums.length];
      result[0]=1;
      for(int i=1;i<nums.length;i++)
         result[i] = result[i-1]*nums[i-1];
      
      int suffixProduct = 1;
      for(int i=nums.length-1;i>=0;i--) {
         result[i] *= suffixProduct;
         suffixProduct *= nums[i];
      }
      return result;
   }
}
