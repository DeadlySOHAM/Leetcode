package SearchIn2DMatrix;

public class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
      int row = matrix.length, col = matrix[0].length;
      int l=0, u=row*col;
      while(l<u){
         int mid = (l+u)/2;
         int midr = getRow(mid,col);
         int midc = getCol(mid,col);
         if(matrix[midr][midc]==target) return true;
         else if(matrix[midr][midc]<target) l = mid+1;
         else u = mid;
      }
      return false;
   }   
   public int getRow(int flattenIndex, int col){
      return (int)(flattenIndex/col);
   }
   public int getCol(int flattenIndex, int col){
      return (int)(flattenIndex%col);
   }
}
