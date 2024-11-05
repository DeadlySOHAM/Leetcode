package RotateImage;


public class Solution {
   
   public void rotate(int[][] matrix) {
      int n = matrix.length-1, depth = 0;
      do {
         for(int j=depth;j<n-depth;j++){
            swap(depth,j,n-j,depth,matrix);
            swap(n-j,depth,n-depth,n-j,matrix);
            swap(n-depth,n-j,j,n-depth,matrix);
         }
      } while(++depth<(int)(n/2)+1);
   }

   private void swap(int a, int b, int c, int d, int[][] matrix){
      int temp = matrix[a][b];
      matrix[a][b] = matrix[c][d];
      matrix[c][d] = temp;
   }
}
