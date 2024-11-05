package LargestRectangleInHistogram;

import java.util.*;

public class Solution {

   public int largestRectangleArea(int[] heights) {
      Stack<Integer> pseIndexStack = new Stack<Integer>();
      int maxArea = Integer.MIN_VALUE;
      for(int i=0;i<heights.length;i++){
         if(pseIndexStack.isEmpty()){
            pseIndexStack.push(i);
         } else {
            while(!pseIndexStack.isEmpty() && heights[pseIndexStack.peek()]>heights[i]) {
               maxArea = Math.max(
                  maxArea,
                  getArea(
                     heights[pseIndexStack.pop()],
                     pseIndexStack.isEmpty()?-1:pseIndexStack.peek(),
                     i
                  ));
            }
            pseIndexStack.push(i);
         }
      }
      while(!pseIndexStack.isEmpty()){
         maxArea = Math.max(
            maxArea,
            getArea(
               heights[pseIndexStack.pop()],
               pseIndexStack.isEmpty()?-1:pseIndexStack.peek(), // there might be previous smaller element (pse)
               heights.length // for left over element in the stack there is not next smaller element (nse)
            ));
      }
      return maxArea;
   }

   private int getArea(int center, int pseIndex, int nseIndex){
      return center * (nseIndex-pseIndex-1);
   }

}
