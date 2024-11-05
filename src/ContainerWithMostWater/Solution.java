package ContainerWithMostWater;


public class Solution {
   public int maxArea(int[] height) {
      int left = 0, right = height.length -1;

      int maxArea = Math.min(height[left],height[right])*Math.abs(left-right), copyMaxArea = maxArea;

      while(left<right){
        if(height[left]<height[right])
          ++left;
        else if(height[left]>height[right])
          --right;
        else{
          ++left;
          --right;
        }
        maxArea = Math.min(height[left],height[right])*Math.abs(left-right);
        copyMaxArea = maxArea>copyMaxArea?maxArea:copyMaxArea;
      }

      return copyMaxArea;
   }
}
