package Permutations;

import java.util.*;


public class Solution {
   
   public List<List<Integer>> permute(int[] nums) {
      ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
      findPermutation(nums,0,result);
      return result;
   }

   public static void findPermutation(int[] nums, int index, ArrayList<List<Integer>> result) {
      if(index == nums.length-1){
         ArrayList<Integer> temp = new ArrayList<Integer>(nums.length);
         for(int i=0;i<nums.length;i++)
            temp.add(nums[i]);
         result.add(temp);
         return;
      }
      for(int swapI = index; swapI<nums.length; swapI++) {
         swap(nums,index,swapI);
         findPermutation(nums,index+1,result);
         swap(nums,index,swapI);
      }
   }

   private static void swap(int[] ch, int dx, int dy){
      int temp = ch[dx];
      ch[dx] = ch[dy];
      ch[dy] = temp;
   }
}
