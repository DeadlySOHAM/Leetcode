package NextPermutation;

import java.util.*;

class Solution{
   
   public void nextPermutation(int[] nums) {
      if(nums.length == 1) return;
      int boundary = Integer.MIN_VALUE;
      for(int i=0;i<nums.length-1;i++){
         if(nums[i]<nums[i+1])
            boundary = i;
      }
      if(boundary == Integer.MIN_VALUE) {
         int left =0, right = nums.length-1;
         while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
         }
      } else {
         int nextGreaterIndex = boundary+1;
         if(nextGreaterIndex<nums.length){
            sort(nums,nextGreaterIndex);
         }
         for(int i=nextGreaterIndex;i<nums.length;i++)
            if(nums[i]>nums[boundary]){
               nextGreaterIndex = i;
               break;
            }
         int temp = nums[boundary];
         nums[boundary] = nums[nextGreaterIndex];
         nums[nextGreaterIndex] = temp;
      }
   }

   public void sort(int[] nums, int i){
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
      while(i<nums.length)
         priorityQueue.add(nums[i++]);
      while(!priorityQueue.isEmpty())
         nums[--i] = priorityQueue.poll();
   }
}