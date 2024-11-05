package RotateImage;

import java.util.*;

public class RotateImage {
   public static void main(String[] args){
      Solution s = new Solution();

      int[][] matrix = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
      s.rotate(matrix);
      print(matrix);

      matrix = new int[][] {{1, 2,  3,  4},
                           {5,  6,  7,  8}, 
                           {9, 10, 11, 12},
                           {13,14, 15, 16}};

      s.rotate(matrix);
      print(matrix);

      matrix = new int[][] {{1,  2,  3,  4,  5},
                           { 6,  7,  8,  9, 10}, 
                           {11, 12, 13, 14, 15},
                           {16, 17, 18, 19, 20},
                           {21, 22, 23, 24, 25}};

      s.rotate(matrix);
      print(matrix);

      matrix = new int[][] {{  1,  2,  3,  4,  5,  6},
                            {  7,  8,  9, 10, 11, 12}, 
                            { 13, 14, 15, 16, 17, 18},
                            { 19, 20, 21, 22, 23, 24},
                            { 25, 26, 27, 28, 29, 30},
                            { 31, 32, 33, 34, 35, 36}};

      s.rotate(matrix);
      print(matrix);
   }

   private static void print(int[][] matrix){
      for(int[] arr : matrix)
         System.out.println(Arrays.toString(arr));
      System.out.println();
   }
}
