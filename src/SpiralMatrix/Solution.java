package SpiralMatrix;

import java.util.*;

public class Solution {

   public List<Integer> spiralOrder(int[][] matrix) {
      int depthX = 0, depthY = 0, rows = matrix.length, cols = matrix[0].length;
      List<Integer> result = new ArrayList<Integer>();
      while(result.size()<rows*cols) {
         
         for(int i=depthX;i<cols-depthX;i++){
            result.add(matrix[depthX][i]);
            if(result.size()>=rows*cols) return result;
         }
         
         for(int i=depthY+1;i<rows-depthY;i++){
            result.add(matrix[i][cols-1-depthX]);
            if(result.size()>=rows*cols) return result;
         }
            
         for(int i=cols-1-depthX-1;i>=depthX;i--){
            result.add(matrix[rows-1-depthY][i]);
            if(result.size()>=rows*cols) return result;
         }
            
         for(int i=rows-1-depthY-1;i>=depthY+1;i--){
            result.add(matrix[i][depthY]);
            if(result.size()>=rows*cols) return result;
         }
         
         if(depthX+1<cols) depthX++;
         if(depthY+1<rows) depthY++;
      }
      return result;
   }
}
