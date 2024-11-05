package JumpGame;

public class Solution {
   public int jump(int[] nums) {
      int jump = 0, current = 0;
      if(nums.length==1) return 0;
      while(current<nums.length) {
         int maxVal = -1, maxIndex = -1;
         if(current+nums[current]>=nums.length-1) {
            jump++;
            break;
         } else {
            for(int i=current+1; i<nums.length && i<=current+nums[current] ;i++){
               int tempMax = nums[i] + ( i - current );
               if(tempMax>maxVal){
                  maxVal = tempMax;
                  maxIndex = i;
               }
            }
         }
         if(maxIndex == -1) break;
         else {
            current = maxIndex;
            ++jump;
         }
      }
      return jump;
   }
}
