package TrappingRainWater;

public class Solution {

   public int trap1(int[] height) {

      int[] prefix = new int[height.length], suffix = new int[height.length];
      prefix[0] = height[0];
      suffix[suffix.length-1] = height[height.length-1];

      // generating suffix and prifix max
      for(int i=1;i<height.length; i++){
         prefix[i] = Math.max(prefix[i-1],height[i]);
         suffix[suffix.length-1-i] = Math.max(suffix[suffix.length-i],height[height.length-1-i]);
      }

      int result = 0;
      for(int i=0;i<height.length;i++){
         int pillar = Math.min(prefix[i],suffix[i]);
         if(pillar>height[i])
            result +=  pillar - height[i];
      }

      return result;
   }


   // Solution 2 more optimized using same as above
   public int trap(int[] height) {
      int result = 0, left = 0, right = height.length-1, leftMax = height[left], rightMax = height[right];
      while(left!=right){
         if(height[left]<=height[right]){
            ++left;
            if(height[left]<leftMax && height[left]<rightMax)
               result += leftMax - height[left];
            else 
               leftMax = Math.max(leftMax,height[left]);
         } else {
            --right;
            if(height[right]<rightMax && height[right]<rightMax)
               result += rightMax - height[right];
            else 
               rightMax = Math.max(rightMax,height[right]);
         }
      }
      return result;
   }

}
