/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

package TwoSum;

class TwoSum{
   public static void main(String args[]){
      int a[] = {2,7,11,15} , target = 9 ;
      // int a[] = {3,2,4} , target = 6 ;
      // int a[]={3,2,3} , target = 6 ;
      // int a[] = {0,4,3,0} , target = 0 ;
      // int a[] = {-1,-2,-3,-4,-5} , target = -8 ;
      a = new Solution().twoSum( a,target) ;
      for(int i:a)
         System.out.print(i+",");
   }
}