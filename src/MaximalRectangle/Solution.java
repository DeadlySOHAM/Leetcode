package MaximalRectangle;

import java.util.Stack;

public class Solution {

   public int maximalRectangle(char[][] matrix) {

      for (int i = 0; i < matrix[0].length; i++) {
         int sum = 0;
         for (int j = 0; j < matrix.length; j++) {
            sum += Integer.parseInt(matrix[j][i] + "");
            if (matrix[j][i] == '0') {
                matrix[j][i] = (char)0;
                sum = 0;
            }
            else  matrix[j][i] = (char) sum;
         }
      }
      int maxArea = Integer.MIN_VALUE;
      for (char[] arr : matrix) {
         maxArea = Math.max(maxArea, largestRectangleArea(arr));
      }
      return maxArea;
   }

   public int largestRectangleArea(char[] heights) {
      Stack<Integer> pseIndexStack = new Stack<Integer>();
      int maxArea = Integer.MIN_VALUE;
      for (int i = 0; i < heights.length; i++) {
         if (pseIndexStack.isEmpty()) {
            pseIndexStack.push(i);
         } else {
            while (!pseIndexStack.isEmpty() && (int) heights[pseIndexStack.peek()] > (int) heights[i]) {
               maxArea = Math.max(
                     maxArea,
                     getArea(
                           (int) heights[pseIndexStack.pop()],
                           pseIndexStack.isEmpty() ? -1 : pseIndexStack.peek(),
                           i));
            }
            pseIndexStack.push(i);
         }
      }
      while (!pseIndexStack.isEmpty()) {
         maxArea = Math.max(
               maxArea,
               getArea(
                     (int) heights[pseIndexStack.pop()],
                     pseIndexStack.isEmpty() ? -1 : pseIndexStack.peek(), // there might be previous smaller element
                                                                          // (pse)
                     heights.length // for left over element in the stack there is not next smaller element (nse)
               ));
      }
      return maxArea;
   }

   private int getArea(int center, int pseIndex, int nseIndex) {
      return center * (nseIndex - pseIndex - 1);
   }

}
